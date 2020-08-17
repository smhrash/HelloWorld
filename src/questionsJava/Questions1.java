package questionsJava;

import java.util.Scanner;

public class Questions1 {

    public static void main(String[] args) {

        // 1. Write a Java program to print an Integer (entered by the user)
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = input.nextInt();
        System.out.println("You entered: "+number);

    }
}
