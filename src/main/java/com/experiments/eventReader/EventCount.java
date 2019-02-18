package com.experiments.eventReader;

import java.util.*;
import java.util.stream.Collectors;

class EventCount{

    HashMap<String, Integer> eventCount = new HashMap<>();

    public void put(String type, Integer count){
        eventCount.put(type, count);
    }

    public void sortByValue(int limit){
        final Map<String, Integer> sortedByCount = eventCount.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        //System.out.println(sortedByCount.toString());

        for( Map.Entry<String, Integer> entry : sortedByCount.entrySet()){
            System.out.println(entry.getKey() + entry.getValue());
            limit --;
            if (limit == 0){
                break;
            }
        }
    }
}