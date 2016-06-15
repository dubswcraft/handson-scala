package java.com.dubswcraft.fp.old;

import java.util.ArrayList;
import java.util.List;

// Check if a string is a palidrome using recursion in FPExercises.Exercise4_Scala_MoreRecursion
//
public class Exercise5_Java_FlatMapping {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        List<Integer> duplicated = new Exercise5_Java_FlatMapping().duplicateElementsOfList(list);
        for (Integer item : duplicated) {
            System.out.println(item);
        }

    }

    List<Integer> duplicateElementsOfList(List<Integer> list) {
        List<Integer> out = new ArrayList<Integer>();

        for (Integer item: list) {
            out.add(item);
            out.add(item);
        }
        return out;
    }

}
