package com.dharbor.generics.demo.upperbound;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: psaradhi
 * Created: 14-03-2023
 * Upper bound means upper restriction or upper limitation.
 */
public class UpperBoundDemo1 {


    public void demo1 (List<? extends Number> value){
        System.out.println(value);
    }

    public static void main(String[] args) {
        UpperBoundDemo1 upperBoundDemo1 = new UpperBoundDemo1();

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4);
        upperBoundDemo1.demo1(integerList);

        List<AtomicInteger> automicIntegerList = new ArrayList<>();
        automicIntegerList.add(new AtomicInteger(1));
        automicIntegerList.add(new AtomicInteger(2));
        automicIntegerList.add(new AtomicInteger(3));
        upperBoundDemo1.demo1(automicIntegerList);


    }
}
