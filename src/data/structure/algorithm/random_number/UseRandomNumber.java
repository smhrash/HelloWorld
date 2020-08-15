package data.structure.algorithm.random_number;

import java.util.Random;

public class UseRandomNumber {

    public static void main(String[] args) {

        int [] numbers = new int[50];

        Random random = new Random();

        for (int i = 0; i < numbers.length; i++){

            System.out.println(random.nextInt(5000000));
        }


    }
}
