// Write a program that reads a set of integers , and then prints the sum of the  even and odd integers.

import java.util.*;
public class Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int SumEven = 0;
        int SumOdd = 0;

        for(int i=1 ; i<=n ; i++){
            if (i % 2 == 0 ){
                SumEven += i;
            }
            if( i % 2 != 0 ){
                SumOdd += i;
            }
        }
        System.out.println("Sum of Even numbers : "+SumEven);
        System.out.println("Sum of Odd numbers : "+SumOdd);
    }
    
}
