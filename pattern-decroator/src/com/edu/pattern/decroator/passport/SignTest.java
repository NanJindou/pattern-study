package com.edu.pattern.decroator.passport;


import com.edu.pattern.decroator.passport.old.SignService;
import com.edu.pattern.decroator.passport.upgrede.ISignForThirdService;
import com.edu.pattern.decroator.passport.upgrede.SignForThirdService;

public class SignTest {
    public static void main(String[] args) {

        //

        ISignForThirdService signForThirdService = new SignForThirdService(new SignService());

        signForThirdService.loginForQQ("XXXsdsda");

    }
}
