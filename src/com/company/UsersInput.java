package com.company;

import java.util.Scanner;

public class UsersInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Name: ");
       String name =input.nextLine();

       String name1= input.nextLine().trim();
        System.out.println("You are "+name);
        System.out.println("Your Name is "+name1);
    }
}
