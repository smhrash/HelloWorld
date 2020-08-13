package com.company;

import java.util.Scanner;

public class LogicalExpression {

    public static void main(String[] args) {

        boolean isWarm = true ;
        Scanner input = new Scanner(System.in);
        System.out.print("Temperature: ");
        int temperature = input.nextInt();
        isWarm= temperature > 20 && temperature < 30;

        System.out.println(isWarm);
    }
}
