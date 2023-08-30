package com.kubertX.springboot.action.test.junit5;

public class Test {

    public static void main(String[] args) {
        float f1 = 100.0f;
        float f2 = 100f;
        System.out.println(f1 >= f2);
        float f3 = 99.9f;
        System.out.println(f3 > f2);
        float f4 = 101f;
        System.out.println(f4 > f2);
    }
}
