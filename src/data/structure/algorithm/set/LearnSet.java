package data.structure.algorithm.set;

import java.util.HashSet;
import java.util.Set;

public class LearnSet {

    // Set is an interface
    // Unordered/unsorted collection
    // Can not store duplicate elements
    // It has more implementations such as HashSet, TreeHashSet and TreeSet

    public static void main(String[] args) {


        Set<String> fruits = new HashSet<>();

        fruits.add("Lemon");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Strawberry");
        fruits.add("Cherry");
        fruits.add("Blue Berry");
        fruits.add("Apple");
        fruits.add("Orange");



        for (String fruit:fruits) {
            System.out.println(fruit);
        }

        fruits.add("Apple");
        fruits.remove("Apple");

        System.out.println(fruits);
        System.out.println(fruits.contains("Orange"));

    }
}
