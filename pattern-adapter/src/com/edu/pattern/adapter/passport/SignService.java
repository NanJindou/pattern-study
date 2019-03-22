package com.edu.pattern.adapter.passport;

import com.edu.pattern.adapter.Member;
import com.edu.pattern.adapter.ResultMsg;

public class SignService {

    /**
     *
     * @param username
     * @param password
     * @return
     */
    public ResultMsg regist(String username,String password){
        return new ResultMsg("200","注册成功",new Member());
    }


    public ResultMsg login(String username,String password){
        return null;
    }

}
