package com.edu.pattern.decroator.Test;

import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

public class DecroatorTest {

    public static void main(String[] args) {

        //虽然 DataInputStream 功能更强大
        //DataInputStream 同样要实现InputStream
        InputStream in =null;
        FilterInputStream fis = new DataInputStream(in);
    }
}
