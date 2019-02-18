package com.experiments;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class RemoveDuplicates {



    public static void removeDuplicates(ArrayList<Integer> alist){

        HashMap<Integer, Boolean> hash = new HashMap<Integer, Boolean>();
        Iterator<Integer> itr = alist.iterator();

        while(itr.hasNext()){
            Integer i = itr.next();
            if (hash.get(i) == null ){
                hash.put(i, true);
            }else{
                itr.remove();
            }
        }
    }
}
