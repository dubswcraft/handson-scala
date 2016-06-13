package com.dubswcraft.fp;

import java.util.ArrayList;
import java.util.List;


public class Exercise3_Java_MoreAggregating_Old {

    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<Person>();
        list.add(new Person("Mary", 30));
        list.add(new Person("Tom", 50));
        list.add(new Person("Andy", 20));
        Integer averageHeight = new Exercise3_Java_MoreAggregating_Old().calculateAverageHeight(list);

        System.out.println(averageHeight);
    }

    Integer calculateAverageHeight(List<Person> people) {
        int heightTotal = 0;
        int heightCount = 0;
        int averageHeight = 0;

        for (Person person : people) {
            heightTotal += person.height;
            heightCount += 1;
        }
        if (heightTotal > 0) {
            averageHeight = heightTotal / heightCount;
        }

        return averageHeight;
    }
}

class Person {

    public final String name;
    public final Integer height;

    public Person(String name, Integer height) {
        this.name = name;
        this.height = height;
    }
}