package com.dharbor.generics.demo.method;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @Author: psaradhi
 * Created: 14-03-2023
 */
public class GenericMethodDemo1 {

    public <E> void demo1(E value) {
        System.out.println(value);
    }
    public static void main(String[] args) {
        GenericMethodDemo1 genericMethodDemo1 = new GenericMethodDemo1();
        genericMethodDemo1.demo1(10);
        genericMethodDemo1.demo1("10");
        genericMethodDemo1.demo1(new ArrayList<>());
        genericMethodDemo1.demo1(new HashMap<>());
    }
}
