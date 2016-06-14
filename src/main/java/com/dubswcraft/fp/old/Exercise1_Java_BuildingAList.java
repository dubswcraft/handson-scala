package com.dubswcraft.fp.old;

import java.util.ArrayList;
import java.util.List;

// EXERCISE 1 - Write this in Scala or Java without using a

public class Exercise1_Java_BuildingAList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        List<String> processedStrings = new Exercise1_Java_BuildingAList().processList(list);

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
