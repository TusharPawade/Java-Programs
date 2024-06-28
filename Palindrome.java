//  Write a Java program tocheckif a number is a palindrome in Java? 
import java.util.*;
public class Palindrome {
    public static boolean Palindrome(int n){
        int rev = 0;

        while (n != 0){
            int lastDigit = n % 10 ;
            rev = (rev *10) + lastDigit ;
            n = n / 10;
        }
        if (n == rev) {
            System.out.println("Pal");
            return true;
        }
        else
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Palindrome(n);
    }
    
}
