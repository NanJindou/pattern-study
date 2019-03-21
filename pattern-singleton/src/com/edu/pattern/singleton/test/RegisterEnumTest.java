package com.edu.pattern.singleton.test;

import com.edu.pattern.singleton.register.RegisterEnum;

public class RegisterEnumTest {
    public static void main(String[] args) {
        System.out.println(RegisterEnum.BLACK);
        RegisterEnum.INSTANCE.getTnstance();
    }

}


