package com.zpb.json;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author       pengbo.zhao
 * @description  
 * @createDate   2021/11/15 18:27
 * @updateDate   2021/11/15 18:27
 * @version      1.0
 */

public class Test {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("A");
        list1.add("B");
        list1.add("B");

        System.err.println(("-----"+3).getClass().getTypeName());
        List<String> list2 = new ArrayList<String>();
        list2.add("C");
        list2.add("B");

        // 2个集合的并集
        list2.retainAll(list1);
        System.out.println("交集:" + list2);
    }

}
