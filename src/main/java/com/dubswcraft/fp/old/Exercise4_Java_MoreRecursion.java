package com.dubswcraft.fp.old;

import java.util.ArrayList;
import java.util.List;

// Check if a string is a palidrome using recursion in FPExercises.Exercise4_Scala_MoreRecursion
//
public class Exercise4_Java_MoreRecursion {

    public static void main(String[] args) {
        System.out.println(new Exercise4_Java_MoreRecursion().isPalidrome("abc"));
    }
    boolean isPalidrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }

}
