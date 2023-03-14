package com.dharbor.generics.demo.classlevel;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @Author: psaradhi
 * Created: 14-03-2023
 */
public class GenericClassDemo1 <T> {

    public void demo1(T value) {
        System.out.println(value);
    }
    public static void main(String[] args) {
        GenericClassDemo1 genericMethodDemo1 = new GenericClassDemo1();
        genericMethodDemo1.demo1(10);
        genericMethodDemo1.demo1("10");
        genericMethodDemo1.demo1(new ArrayList<>());
        genericMethodDemo1.demo1(new HashMap<>());
    }
}
