package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetCreator {
    private HashSet<Integer> result = new HashSet<>();
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {


        for(Integer i : sourceList){
            if(i % 2 != 0){
                result.add(i);
                result.add(i*2);
            }else {
                processEvenNumber(i);
            }
        }

        return result;
    }

    private void processEvenNumber(Integer number){
        result.add(number);
        number /= 2;
        if(number % 2 != 0){
            result.add(number);
            return;
        }
        processEvenNumber(number);
    }
}
