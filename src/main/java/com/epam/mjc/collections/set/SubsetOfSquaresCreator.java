package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> result = new TreeSet<>();

        for(Integer i : sourceList){
            result.add(i*i);
        }

        return result.subSet(lowerBound, true, upperBound, true);
    }
}
