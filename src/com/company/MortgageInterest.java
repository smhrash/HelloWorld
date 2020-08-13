package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageInterest {

    public static void main(String[] args) {


        doCalculateMortgageRate();
    }

        public static void doCalculateMortgageRate() {

            final byte MONTH_IN_YEAR = 12;
            final byte PERCENT = 100;
            int principal = 0;
            float monthlyInterest = 0;
            int numberOfPayments = 0;


            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.print("Principal: ");
                principal = scanner.nextInt();
                if (principal >= 1_000 && principal <= 1_000_000)
                    break;
                System.out.println("Please enter Principal amount between 1000 - 1000000");

            }
            while (true) {

                System.out.print("Annual interested rate: ");
                float annualInterestRate = scanner.nextFloat();
                monthlyInterest = annualInterestRate / PERCENT / MONTH_IN_YEAR;
                if (annualInterestRate >= 1 && annualInterestRate <= 30)
                    break;
                System.out.println("Please enter Annual MortgageInterest rate between 1 - 30");


            }
            while (true) {
                System.out.print("Period of (Years): ");
                byte years = scanner.nextByte();
                numberOfPayments = years * MONTH_IN_YEAR;
                if (years >= 5 && years <= 30)
                    break;
                System.out.println("Please enter Years between 5 - 30");
            }

            double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                    / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
            String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
            System.out.println("Mortgage: " + mortgageFormatted);
        }

    }

