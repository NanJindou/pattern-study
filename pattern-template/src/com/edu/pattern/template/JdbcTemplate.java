package com.edu.pattern.template;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcTemplate {

    /**
     * DataSource 数据源
     */
    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource){
        this.dataSource =dataSource;
    }

    private Connection getConnection() throws Exception{
        return this.dataSource.getConnection();
    }

    private PreparedStatement createPreparedStatement(Connection conn,String sql) throws Exception{
        return conn.prepareStatement(sql);
    }


    private ResultSet excuteQuery(PreparedStatement pstmt,Object[] values) throws Exception{

        for(int i =0;i<values.length;i++){
            //???
            pstmt.setObject(i,values[i]);
        }
        return pstmt.executeQuery();
    }


    //关闭结果集
    private void closeResultSet (ResultSet rs) throws Exception{
        rs.close();
    }

    //关闭语句集
    private void closePreparedStatement(PreparedStatement pstmt) throws Exception{
        pstmt.close();
    }

    private void closeConnection(Connection conn) throws Exception{
        //通常把它放到连接池回收
    }

    private List<?> parseReultSet(ResultSet rs,RowMapper rowMapper) throws Exception{
        List<Object> result = new ArrayList<Object>();
        int rowNum = 1;
        while(rs.next()){
            result.add(rowMapper.mapRow(rs,rowNum ++));
        }
        return result;
    }

    public List<?> executeQuery(String sql, RowMapper<?> rowMapper,Object[] values){
        try{
            //1、获取连接
            Connection conn = this.getConnection();
            //2、创建语句集
            PreparedStatement pstmt = this.createPreparedStatement(conn,sql);
            //3、执行语句集，并且获得结果集
            ResultSet rs = this.excuteQuery(pstmt,values);
            //4、解析语句集
            List<?> result = parseReultSet(rs,rowMapper);
//            List<Object> result = new ArrayList<Object>();
//            int rowNum =1;
//            while(rs.next()){
//                result.add(new rowMapper(rs,rowNum++));
//            }
            //5、关闭结果集
           this.closeResultSet(rs);
            //6、关闭语句集
           this.closePreparedStatement(pstmt);
            //7、关闭连接
            this.closeConnection(conn);
            return result;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

//    public abstract Object processResult(ResultSet rs,Integer rowNum) throws Exception;


    /**
     *

    public Mcc getMcc(String amNumber) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet set = null;
        try {
            connection = ConnectionSource.getConnection();
            String sql = "select pay_state,(case when replace(amm_pay_begintime,':','')<=to_char(sysdate,'hh24miss')  "
                    + "and to_char(sysdate,'hh24miss')<=replace(amm_pay_endtime,':','') then '1' else '0' end) nowcan,"
                    + "nvl(amm_minmoney,15.0),nvl(amm_maxmoney,500.0),nvl(amm_fee,2.0),mcc_rate from ep_aminfo_mcc where 1 = 1 and  and am_id = (select am_id from ep_agtmercinfo where am_number=?) ";
            statement = connection.prepareStatement(sql);
            statement.setString(1, amNumber);
            set = statement.executeQuery();
            if (set.next()) {
                Mcc bean  = new Mcc();
                bean.setPayState(set.getInt(1));
                bean.setNowCan(set.getInt(2));
                bean.setMccMinMoney(set.getDouble(3));
                bean.setMccMaxMoney(set.getDouble(4));
                bean.setMccFee(set.getDouble(5));
                return bean;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            ConnectionSource.closeAll(connection, set, statement);
        }
        return null;
    }
     */


}
