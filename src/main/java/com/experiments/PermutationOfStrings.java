package com.experiments;

import java.util.Arrays;

public class PermutationOfStrings {

    Boolean isPermutationOfEachOther(String s1, String s2){

        char [] arr1 = s1.toCharArray();
        char [] arr2  = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (arr1.toString().equals(arr2.toString())){
            return true;
        }


        return false;
    }
}
