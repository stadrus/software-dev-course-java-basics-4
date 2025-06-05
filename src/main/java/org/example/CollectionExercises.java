package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionExercises {
    public String[] makeFruitStringArray() {
        // EXAMPLE:
        // Create and return an array of strings with the following values:
        // "apple", "banana", "cherry", "date", "elderberry"
        // Replace the line below with your implementation
        String[] fruits = new String[5];
        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "cherry";
        fruits[3] = "date";
        fruits[4] = "elderberry";
//        String [] fruits = {"apple", "banana", "cherry", "date", "elderberry"};
        return fruits;
    }

    public String[] makeFruitStringArrayWithSize(int size) {
        // Create and return an array of strings with the given size (from the parameter)
        // Use a loop to set every element to "apple"
        // Replace the line below with your implementation
        String [] arrayWithSize = new String[3];
            for(int i = 0; i < size; i++){
                arrayWithSize[i]="apple";
            System.out.println(Arrays.toString(arrayWithSize));
        }
      return arrayWithSize;
    }

    public String[] makeTopThreeArray(String[] fruits) {
        // Create and return a new array of strings containing the first three elements of the given array
        // Replace the line below with your implementation
        // Geeks for Geeks Arrays.copyOf()//
        String [] newArray = Arrays.copyOf(fruits, 3);
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }

    public ArrayList<String> makeFruitList() {
        // Create and return an ArrayList of strings with the following values:
        // "apple", "banana", "cherry", "date", "elderberry"
        // Replace the line below with your implementation

        ArrayList<String>fruitList= new ArrayList<>();
        fruitList.add("apple");
        fruitList.add("banana");
        fruitList.add("cherry");
        fruitList.add("date");
        fruitList.add("elderberry");
        System.out.println(fruitList);
        return fruitList;
    }

    public ArrayList<String> makeListOfThreeFruits(String fruit1, String fruit2, String fruit3) {
        // Create and return an ArrayList of strings with the given values
        // Replace the line below with your implementation
       ArrayList<String> fruitList = new ArrayList<>();
       fruitList.add(fruit1);
        fruitList.add(fruit2);
        fruitList.add(fruit3);
        return fruitList;
    }

    public HashMap<String, String> makeFruitMap() {
        // Create and return a HashMap with the following key-value pairs:
        // "apple" -> "red", "banana" -> "yellow", "cherry" -> "red", "date" -> "brown", "elderberry" -> "black"
        // Replace the line below with your implementation
        HashMap<String, String> makeMap = new HashMap<String, String>();
        makeMap.put("apple", "red");
        makeMap.put("banana", "yellow");
        makeMap.put("cherry", "red");
        makeMap.put("date", "brown");
        makeMap.put("elderberry", "black");
        System.out.println(makeMap);
        return makeMap;
    }

    public String lookupAppleColor(HashMap<String, String> fruitMap) {
        // Return the value associated with the key "apple" in the given map, using the get method
        // Replace the line below with your implementation
        fruitMap.get("apple");
        System.out.println(fruitMap);
        return String.valueOf(fruitMap.containsValue("red"));
    }

    public HashSet<String> makeFruitSet(String fruit1, String fruit2, String fruit3) {
        // Create and return a HashSet of strings with the given values
        // Replace the line below with your implementation
        HashSet<String> fruitSet = new HashSet<>();
        fruitSet.add(fruit1);
        fruitSet.add(fruit2);
        fruitSet.add(fruit3);
        return fruitSet;

    }
}
