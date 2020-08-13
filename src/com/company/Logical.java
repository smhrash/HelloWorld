package com.company;

import java.util.Scanner;

public class Logical {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Monthly Income: ");
        int monthlyIncome = input.nextInt();
        System.out.print("Credit Score: ");
        double creditScore = input.nextDouble();
        System.out.print("You have criminal record (True/false): ");
        boolean hasCriminalRecord = input.nextBoolean();
        if ((monthlyIncome >= 3000 || creditScore >= 7.5) && !hasCriminalRecord) {

            System.out.println("You are eligible for loan");

        } else {
            System.out.println("You are not eligible for loan");
        }
    }
}
