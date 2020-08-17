package questionsJava;

public class Questions21 {
    // Write a Java Program to count number of digits of an Integer.

    public static void main(String[] args) {
        
        int num = 126543;
        int count=0;

        while (num !=0){
            num = num/10;
            ++count;
        }
        System.out.println("The Number of digit: "+count);
    }
}
