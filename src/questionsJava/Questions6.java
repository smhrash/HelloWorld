package questionsJava;

public class Questions6 {
    // Write a Java Program to swipe two numbers

    public static void main(String[] args) {

        int num1 = 50;
        int num2 = 40;

        System.out.println("The first number is: "+num1);
        System.out.println("The Second number is: "+num2);
        int temp;

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("The first number is: "+num1);
        System.out.println("The Second number is: "+num2);
    }
}
