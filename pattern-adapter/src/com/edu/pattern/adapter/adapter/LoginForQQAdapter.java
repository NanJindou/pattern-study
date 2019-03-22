package com.edu.pattern.adapter.adapter;

import com.edu.pattern.adapter.ResultMsg;

public class LoginForQQAdapter implements  LoginAdapter {
    @Override
    public Boolean support(Object adater) {
        return adater instanceof  LoginForQQAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
