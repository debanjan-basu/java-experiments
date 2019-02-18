package com.experiments;

import java.util.*;

public class AllUniqueCharacters {

    public static Boolean isAllCharactersUnique(String s) throws Exception{

        if (s == null  || s.isEmpty()){
            throw new Exception("invalid param");
        }
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        for (int i = 0; i < s.length() - 1; i ++){
            if (arr[i] == arr[i + 1]){
                return false;
            }
        }

        return true;
    }
}
