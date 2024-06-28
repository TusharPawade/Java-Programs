/* Write a Program to Count Number of Even and Odd. 
Input: 1234 
Output: Even  */

import java.util.*;
public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        
        if (n%2 == 0) {
            System.out.println("Even ");
        }
        else
        System.out.println("odd");
    }
}
