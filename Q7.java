/*Write a Program to Find Prime Numbers in Given Range. 
Input: 2 10 
Output: Prime Numbers bw 2 and 10 are – 2 3 5 7 */

import java.util.*;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            int count = 0; // Reset count for each new integer
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2)
            System.out.print(" "+i);
        }
    }
}
