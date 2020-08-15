package questionsJava;

import java.util.Scanner;

public class Questions11 {

    // Write a Java Program to find out a leap year
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a year");
        int year = input.nextInt();
        boolean isLeapYear;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                } else {
                    isLeapYear = false;
                }
            }else {
                isLeapYear=true;
            }

        }else {
            isLeapYear =false;
        }
        if (isLeapYear){
            System.out.println("The year you entered is a leap year");
        }
        else {
            System.out.println("The year you entered is a not leap year");
        }
    }


}




