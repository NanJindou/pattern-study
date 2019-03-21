package com.edu.pattern.factory.FactoryMethod;

import com.edu.pattern.factory.Milk;
import com.edu.pattern.factory.Telunsu;

public class TelunsuFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new Telunsu();
    }
}
