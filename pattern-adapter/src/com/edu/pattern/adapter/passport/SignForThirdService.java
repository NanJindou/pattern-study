package com.edu.pattern.adapter.passport;

import com.edu.pattern.adapter.ResultMsg;

/**
 * 稳定的方法不懂，直接继承下来
 */
public class SignForThirdService extends SignService {

    public ResultMsg loginForQQ(String openId) {




        //1、openId是全局唯一，可以把它当成一个用户名(加长)
        //2、密码默认为null（QQ_EMPTY）
        //3、注册（在原有系统里面创建一个用户）
        ResultMsg msg = super.regist(openId,null);
        //4、调用原来的方法
        msg = super.login(openId,null);
        return msg;
    }
    public ResultMsg loginForWechat(String openId){
        return null;
    }

    public ResultMsg loginforToken(String token){
        //通过Token拿到用户信息，然后重新登陆一次
        return null;
    }
    public ResultMsg loginForTelphone(String phone,String code){
        return null;
    }
    public ResultMsg loginForRegist(String username,String password){
        ResultMsg msg = super.regist(username,null);
        //4、调用原来的方法
        msg = super.login(username,null);
        return msg;
    }


}
