package com.dharbor.generics.demo.upperbound;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @Author: psaradhi
 * Created: 14-03-2023
 */
public class UpperBoundDemo3 {

    public <E extends Serializable> void demo3 (E value){
        System.out.println(value);
    }

    public static void main(String[] args) {

        UpperBoundDemo3 upperBoundDemo3 = new UpperBoundDemo3();
        upperBoundDemo3.demo3("1");
        upperBoundDemo3.demo3(new ArrayList<>());
        upperBoundDemo3.demo3(1);

    }
}
