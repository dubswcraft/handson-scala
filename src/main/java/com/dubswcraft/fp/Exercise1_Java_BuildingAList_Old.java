package com.dubswcraft.fp;

import java.util.ArrayList;
import java.util.List;

public class Exercise1_Java_BuildingAList_Old {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        List<String> processedStrings = new Exercise1_Java_BuildingAList_Old().processList(list);

        for (String processedItem : processedStrings) {
            System.out.println(processedItem);
        }
    }

    List<String> processList(List<String> list) {
        List<String> out = new ArrayList<String>();

        for (String item: list) {
            out.add(doSomeProcessing(item));
        }
        return out;
    }

    private String doSomeProcessing(String item) {
        return item + " processed";
    }
}
