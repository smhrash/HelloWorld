package demo;

import okhttp3.Route;

import java.util.Scanner;

public class EveryDayPractice {

    public static void main(String[] args) {


       long num = 3473288856L;
       int count= 0;
       while (num != 0){
           num = num/10;
           ++count;
       }

        System.out.println(count);


    }
}
