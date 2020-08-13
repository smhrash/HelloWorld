package oop.polymorphism.overloading;

public class TestCalculator {

    public static void main(String[] args) {

        Calculator cal =new Calculator();
        cal.doSummation();
        cal.doSummation(50,30);
        cal.doSummation(99,98,97);
    }
}
