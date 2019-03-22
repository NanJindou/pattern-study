package com.edu.pattern.decroator.passport.old;

public interface ISignService {

    public ResultMsg regist(String username, String password);
    /**
     * 登录的方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg login(String username,String password);

}
