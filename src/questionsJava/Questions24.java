package questionsJava;

public class Questions24 {

    // write a Java program whether a number palindrome or not
    public static void main(String[] args) {

        // 121
        int num = 121;
        int rev = 0;
        int activeNum = num;

        while (num != 0){
            int n = num % 10;
            rev = rev * 10 + n;
            num = num/10;
        }
        System.out.println(rev);

        if (activeNum == rev){
            System.out.println(activeNum+" is a palindrome");
        }else {
            System.out.println(activeNum+" is a not palindrome");
        }

    }
}
