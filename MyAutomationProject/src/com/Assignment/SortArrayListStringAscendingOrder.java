package com.Assignment;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListStringAscendingOrder {
    public static void main(String[] args) {
        
        ArrayList<String> words = new ArrayList<>();
        
       
        words.add("Banana");
        words.add("Apple");
        words.add("Orange");
        words.add("Mango");
        words.add("Pineapple");
        
      
        System.out.println("Original ArrayList: " + words);
        
   
        Collections.sort(words);
        
        System.out.println("ArrayList sorted in Ascending Order: " + words);
    }
}