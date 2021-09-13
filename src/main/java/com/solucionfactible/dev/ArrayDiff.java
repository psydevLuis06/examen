package com.solucionfactible.dev;

import java.util.ArrayList;
import java.util.List;

/**
 * diff subtracts one list from another and returns the result. It should remove
 * all values from list a, which are present in list b keeping their order.
 *
 * @author developer
 */
public class ArrayDiff {

    public static int[] diff(int[] a, int[] b) {

        int[] c = new int[]{};
        
        List<String> myListA = new ArrayList<>();
        List<String> myListB = new ArrayList<>();
        List<Integer> myListC = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            myListA.add(Integer.toString(a[i]));
        }
        
        for (int i = 0; i < b.length; i++) {
            myListB.add(Integer.toString(b[i]));
        }
        
        
        myListA.removeIf(x -> myListB.contains(x)); 
        
        
        for(String s : myListA) myListC.add(Integer.valueOf(s));


        int[] primitive = myListC.stream()
                            .mapToInt(Integer::intValue)
                            .toArray();
        return primitive;
    }

   
}
