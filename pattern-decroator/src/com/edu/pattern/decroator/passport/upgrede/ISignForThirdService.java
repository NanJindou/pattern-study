package com.edu.pattern.decroator.passport.upgrede;

import com.edu.pattern.decroator.passport.old.ResultMsg;
import com.edu.pattern.decroator.passport.old.ISignService;

public interface ISignForThirdService extends ISignService {

    public ResultMsg loginForQQ(String openId);

    public ResultMsg loginForWechat(String openId);

    public ResultMsg loginForToken(String token);
    public ResultMsg loginForTelphone(String phone,String code);


    public ResultMsg loginForRegist(String username, String password);


}
