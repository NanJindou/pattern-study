package com.edu.pattern.delegate.leader;

import java.util.HashMap;
import java.util.Map;

public class Leader implements  ITarget{

    private Map<String,ITarget> targets = new HashMap<String,ITarget>();

    public Leader(){
        targets.put("加密",new TargerA());
        targets.put("登录",new TargetB());
    }

    //自己不干活让别人干
    @Override
    public void doing(String command) {
        targets.get(command).doing(command);
    }


}
