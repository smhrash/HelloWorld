package questionsJava;

public class Questions13 {

    // Write a Java Program to check the character is alphabet or not
    public static void main(String[] args) {

        char ch = '@';

        if (ch>= 'a' && ch<= 'z'||ch>='A' && ch<='Z'){
            System.out.println(ch+" is an alphabet");
        }else {
            System.out.println(ch+" is not an alphabet");
        }
    }
}
