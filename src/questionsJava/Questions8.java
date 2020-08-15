package questionsJava;

public class Questions8 {

    // Write a Java Program to figure out character is vowel or consonant
    public static void main(String[] args) {


        char ch='h';

        if (ch == 'a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
            System.out.println("The Character is Vowel");

        }else {
            System.out.println("The Character is consonant");
        }

        System.out.println("=========================== using switch case =========================");

        switch (ch){

            case ('a'):
            case ('A'):
            case ('e'):
            case ('E'):
            case ('i'):
            case ('I'):
            case ('o'):
            case ('O'):
            case ('u'):
            case ('U'):
                System.out.println("The Character is Vowel");
                break;

                default:
                System.out.println("The Character is consonant");
        }

    }
}
