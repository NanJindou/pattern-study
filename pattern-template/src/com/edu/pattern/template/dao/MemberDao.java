package com.edu.pattern.template.dao;

import com.edu.pattern.template.JdbcTemplate;
import com.edu.pattern.template.RowMapper;
import com.edu.pattern.template.entity.Member;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class MemberDao  {

    private JdbcTemplate jdbcTemplate = new JdbcTemplate(null);

//    public MemberDao(DataSource dataSource) {
//        super(dataSource);
//    }

//    @Override
//    public Object processResult(ResultSet rs, Integer rowNum) throws Exception {
//        Member member = new Member();
//        member.setUsername(rs.getString("username"));
//        member.setPassword(rs.getString("passwork"));
//        member.setAge(rs.getInt("age"));
//        member.setAddr(rs.getString("addr"));
//        return member;
//    }



    public List<?> query(){
        String sql = "select * from t_member";
        return  jdbcTemplate.executeQuery(sql, new RowMapper<Member>() {
            @Override
            public Member mapRow(ResultSet rs, int rowNum) throws Exception {
                Member member = new Member();
                member.setUsername(rs.getString("username"));
                member.setPassword(rs.getString("passwork"));
                member.setAge(rs.getInt("age"));
                member.setAddr(rs.getString("addr"));
                return member;
            }
        },null);
    }
}
