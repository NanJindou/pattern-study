package com.edu.pattern.adapter.adapter;

import com.edu.pattern.adapter.ResultMsg;

/**
 * 在适配器里面，这个接口可有可无
 * 模板模式一定是个抽象类。而这里仅仅只是一个接口
 */
public interface LoginAdapter {

    Boolean support(Object adater);

    ResultMsg login(String id ,Object adapter);
}
