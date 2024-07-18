package dev.hugo;

import java.util.HashSet;
import java.util.Set;

public class EqualElements {

    public static Set<Integer> findDuplicates(int[] array) {
        Set<Integer> duplicates = new HashSet<>();
        Set<Integer> uniqueElements = new HashSet<>();

        for (int element : array) {
            if (!uniqueElements.add(element)) {
                duplicates.add(element);
            }
        }

        return duplicates;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 4, 4, 5, 2};
        
        Set<Integer> duplicates = findDuplicates(array);
        
        if (duplicates.isEmpty()) {
            System.out.println("No duplicate elements.");
        } else {
            System.out.println("Duplicate elements: " + duplicates);
        }
    }
}

