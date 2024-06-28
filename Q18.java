// Write a Program to Print Even and Odd Numbers in Array. 
// Input: a[]={1,2,3,4} 
// Output: Even Numbers 2,4 
//    Odd NUMBERS 1,2 
import java.util.*;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int Even = 0;
        int Odd = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            if (a[i] % 2 == 0) {
                System.out.println("Even no. : " + a[i]);
                Even++;
            } else {
                System.out.println("Odd no. : " + a[i]);
                Odd++;
            }
        }

        System.out.println("Total Even numbers: " + Even);
        System.out.println("Total Odd numbers: " + Odd);
    }
}
