package questionsJava;

import java.util.Scanner;

public class Questions7 {

    // Write a Java Program to check a number odd or even

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = input.nextInt();
        if (number % 2 == 0 && number !=0){
            System.out.println(number+" is even number");
        }
        else if (number == 0){
            System.out.println("You entered \"0\", please enter other any number");

        }else{
            System.out.println(number+" is odd number");
        }
    }
}
