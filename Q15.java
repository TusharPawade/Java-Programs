/* Write a Program to Find the Largest Number. 
Input: a=10 , b=20, c=30 
Output: Largest Number is 30 */

import java.util.*;
public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        
        if (a>b && a>c) {
            System.out.println(a+" is largest no. ");
        }
        else if (b>c) {
           System.out.println(b+" is largest no. "); 
        }
        else
        System.out.println(c+" is largest no. ");
    }
    
}
