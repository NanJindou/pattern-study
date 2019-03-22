package com.edu.pattern.adapter.adapter;

import com.edu.pattern.adapter.ResultMsg;
import com.edu.pattern.adapter.passport.SignService;

/**
 * 稳定的方法不懂，直接继承下来
 */
public class SignForThirdService extends SignService {

    public ResultMsg loginForQQ(String openId) {
        //适配器不一定实现接口
        LoginAdapter adapter = new LoginForQQAdapter();
        //判断接口是否正确
        if(adapter.support(adapter)){
            return adapter.login(openId,adapter);
        }
        return null;

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
        return null;
    }


}
