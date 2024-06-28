/* Write a Program to Check Number is Armstrong Number.  
Input: 153 
Output: yes 
153 is an Armstrong Number 
1x1x1 + 5x5x5 + 3x3x3 = 153  */

import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Enter a length of number : ");
        int p = sc.nextInt();
        sc.close();

        int temp = n;
        int sum = 0;
        
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit , p);
            temp /= 10;
        }

        if (sum == n) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
}

