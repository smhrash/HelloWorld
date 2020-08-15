package data.structure.algorithm.set;

import java.util.TreeSet;

public class LearnTreeSet {


    // TreeSet is an Implementation
    // ordered/sorted collection
    // Can not store duplicate elements
    // It has more implementations such as HashSet, TreeHashSet


    public static void main(String[] args) {

        TreeSet<String> names = new TreeSet<>();
        names.add("Sarker");
        names.add("Rashid");
        names.add("Denys");
        names.add("Maoya");


        for (String name:names) {
            System.out.println(name);
        }
        System.out.println(names);


        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(46);
        numbers.add(47);
        numbers.add(48);
        numbers.add(86);
        numbers.add(986);
        numbers.add(406);

        System.out.println(numbers);

    }

}
