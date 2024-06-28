/*Write a Program for Fibonacci Series. 
Ex- Fibonacci Series till 10 Terms: 
0, 1, 1, 2, 3, 5, 8, 13, 21, 34  */

import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int firstTerm= 0 ;
        int secondTerm= 1;
        System.out.print(firstTerm);
        System.out.print(" "+secondTerm);
        for (int i=1 ; i<=n-2 ; ++i){
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            System.out.print(" "+nextTerm);
        }
        sc.close();
    }
}
