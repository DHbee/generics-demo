package com.dharbor.generics.demo.upperbound;

import java.io.Serializable;
import java.util.*;

/**
 * @Author: psaradhi
 * Created: 14-03-2023
 * Upper bound means upper restriction or uppper limitation
 */
public class UpperBoundDemo2 {

    public void demo2 (List<? extends Serializable> value){
        System.out.println(value);
    }

    public static void main(String[] args) {

        UpperBoundDemo2 upperBoundDemo2 = new UpperBoundDemo2();

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4);
        upperBoundDemo2.demo2(integerList);

        List<String> stringList = Arrays.asList("1", "2", "3", "4");
        upperBoundDemo2.demo2(stringList);

        HashMap customMap = new HashMap();
        customMap.put("1", "one");
        customMap.put("2", "two");
        customMap.put("3", "three");
        List<HashMap> mapList = new ArrayList<>();
        mapList.add(customMap);
        upperBoundDemo2.demo2(mapList);


        ArrayList customList = new ArrayList();
        customList.add("1");
        customList.add("2");
        customList.add("3");
        List<ArrayList> mapList1 = new ArrayList<>();
        mapList1.add(customList);
        upperBoundDemo2.demo2(mapList1);






    }
}
