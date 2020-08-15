package questionsJava;

public class Questions9 {

    // Write a Java Program to find out the Largest number

    public static void main(String[] args) {

        int a = 85;
        int b = 145;
        int c = 55;

        if (a > b && a > c) {
            System.out.println("a is the largest number");
        } else if (b > c) {
            System.out.println("b is the largest number");
        } else {
            System.out.println("c is the largest number");
        }
    }
}
