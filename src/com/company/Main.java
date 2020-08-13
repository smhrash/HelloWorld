package com.company;


public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World");

        String message = "Hello World!!";
        System.out.println(message.endsWith("!!"));
        System.out.println(message.startsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.charAt(3));
        System.out.println(message.indexOf("W"));
        System.out.println(message.replace("!","#"));
        System.out.println(message.replace("l","n"));
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());

        String message1= "    I love Java";
        System.out.println(message1);
        System.out.println(message1.trim());

        String message2 = "Hello \"Rash\"";
        System.out.println(message2);
        String message3= "Hello \nRash";
        System.out.println(message3);
        String message4 = "Hello \tRash";
        System.out.println(message4);
        String message5 = "c:\\Windows\\...";
        System.out.println(message5);

    }
}