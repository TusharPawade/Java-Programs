/* Write a Program to Count Number of digits in a Number. 
Input: 1234 
Outpt: No of digits are = 4 */

import java.util.*;
public class Q11 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0 ;
    while (n>0) {
        int digit = n%10;
        count++;
        n/=10;
    }
    System.out.println(count);
}    
}
