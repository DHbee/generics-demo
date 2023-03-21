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
        GenericClassDemo1<Integer> genericMethodDemo1 = new GenericClassDemo1<>();
        genericMethodDemo1.demo1(10);

        GenericClassDemo1<String> genericMethodDemo2 = new GenericClassDemo1<>();
        genericMethodDemo2.demo1("10");

        GenericClassDemo1<ArrayList> genericMethodDemo3 = new GenericClassDemo1<>();
        genericMethodDemo3.demo1(new ArrayList<>());

        GenericClassDemo1<HashMap> genericMethodDemo4 = new GenericClassDemo1<>();
        genericMethodDemo4.demo1(new HashMap<>());
    }
}
