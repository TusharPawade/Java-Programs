/*Write a Program to find Factorial of a Number. 
Input: 5 
Output: 120       5!= 5x4x3x2x1=120 */

import java.util.*;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int fact = 1;
        for (int i=1 ; i<=n ; i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
