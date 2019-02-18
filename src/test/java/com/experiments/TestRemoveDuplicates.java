package com.experiments;

import org.junit.Test;

import java.util.ArrayList;

public class TestRemoveDuplicates {

    @Test
   public void testRemoveDuplicates(){

        ArrayList<Integer> array = new ArrayList<>();

        array.add(7);
        array.add(20);
        array.add(40);
        array.add(7);
        array.add(9);
        array.add(7);
        array.add(9);
        array.add(7);

        RemoveDuplicates.removeDuplicates(array);
        System.out.println(array.toString());
        assert(array.size()== 4);


    }
}
