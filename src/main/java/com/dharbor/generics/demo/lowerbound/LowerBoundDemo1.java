package com.dharbor.generics.demo.lowerbound;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: psaradhi
 * Created: 14-03-2023
 * Lower bound means lower restriction or lower limitation
 */
public class LowerBoundDemo1 {

    public void demo1(List<? super Integer> list){
        System.out.println(list);
    }

    public static void main(String[] args) {

        LowerBoundDemo1 lowerBoundDemo1 = new LowerBoundDemo1();

        List<Integer> integerList = Arrays.asList(1, 2, 3);
        lowerBoundDemo1.demo1(integerList);

        List<Number> numberList = Arrays.asList(1f, 1.0, 3f, 2l);
        lowerBoundDemo1.demo1(numberList);


    }
}
