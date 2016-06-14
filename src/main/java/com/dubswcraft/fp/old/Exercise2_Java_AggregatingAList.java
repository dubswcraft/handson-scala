package com.dubswcraft.fp.old;

import java.util.ArrayList;
import java.util.List;


public class Exercise2_Java_AggregatingAList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(3);
        list.add(4);
        Integer totalStats = new Exercise2_Java_AggregatingAList().calculateTotalStats(list);

        System.out.println(totalStats);
    }

    Integer calculateTotalStats(List<Integer> list) {
        int total = 0;

        for (Integer item : list) {
            total += calculateStats(item);
        }
        return total;
    }

    private Integer calculateStats(Integer item) {
        return item * 2;
    }
}
