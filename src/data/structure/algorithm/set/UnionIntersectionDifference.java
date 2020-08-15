package data.structure.algorithm.set;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionIntersectionDifference {

    public static void main(String[] args) {

        int [] num1= {1,2,4,5,8,9};
        int [] num2= {3,4,5,6,7,10};

        Set<Integer> number1= new HashSet<>();
        number1.addAll(Arrays.asList(new Integer []{1,2,4,5,8,9}));

        Set<Integer> number2 = new HashSet<>();
        number2.addAll(Arrays.asList(new Integer[]{3,4,5,6,7,10}));

        Set<Integer> union = new HashSet<>(number1);
        union.addAll(number2);// add both arrays and removes all duplicate values
        System.out.println("Union Set is: "+union);

        Set<Integer> intersection = new HashSet<>(number1);
        intersection.retainAll(number2);// only common values of both Arrays
        System.out.println("Intersection Set is: "+intersection);

        Set<Integer> difference = new HashSet<>(number1);
        difference.removeAll(number2); // Uncommon values of both Arrays
        System.out.println("Difference Set is: "+difference);


    }
}

