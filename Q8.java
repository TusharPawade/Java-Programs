/*Write a Program to Find Weather the given Number is Prime Number or Not. 
Input: 2 
Output: Prime Number */

import java.util.*;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0 ;
        for (int i = 1; i <= n ; i++) {
            if (n%i == 0){
                count++;
            }
        }
            if (count == 2) {
            System.out.println("It is prime no. ");
        }
        else
        System.out.println("It is not a prime no. ");
        
    }
}
