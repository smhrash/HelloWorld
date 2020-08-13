package oop.polymorphism.overloading;

public class Calculator {

    public void doSummation(){

        int number1= 30;
        int number2 = 25;
        int number= number1+number2;

        System.out.println(number);

    }
    public void doSummation(int num1, int num2){

        int number1= num1;
        int number2= num2;
        int number= number1+number2;
        System.out.println(number);

    }public void doSummation(int num1, int num2, int num3){

        int number1= num1;
        int number2= num2;
        int number3= num3;
        int number = number1+number2+number3;
        System.out.println(number);

    }
}
