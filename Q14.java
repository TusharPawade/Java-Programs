/* Write a Program to Find Sum of Digits in a Number. 
Input: 1234 
Output: 10  */
 
import java.util.*;
public class Q14 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();   
        int sum = 0;
        
        while (n>0) {
            int digit = n%10;
            sum = sum + digit;
            n/=10;
        }
        System.out.println("sum = " +sum);
    }
}
