package com.company;

public class UseForEachLoop {

    public static void main(String[] args) {

        String [] fruits ={"Apple", "Mango","Orange", "Pineapple","StrawBerry"};
        for (int i =0; i <fruits.length; i++){
            System.out.println(fruits[i]);
        }

        System.out.println("=================== using for each loop ===========================");

        for (String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
