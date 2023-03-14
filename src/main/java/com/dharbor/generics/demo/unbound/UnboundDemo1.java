package com.dharbor.generics.demo.unbound;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: psaradhi
 * Created: 14-03-2023
 */
public class UnboundDemo1 {

    public void demo1(List<?> list){
        System.out.println(list);
    }

    public static void main(String[] args) {

        UnboundDemo1 unboundDemo1 = new UnboundDemo1();

        List<Integer> integerList = Arrays.asList(1, 2, 3);
        unboundDemo1.demo1(integerList);

        List<String> stringList = Arrays.asList("1", "2", "3");
        unboundDemo1.demo1(stringList);

    }
}
