/*Write a Program to Check 2 Arrays are Equal or Not.
Input: a[]={1,2,3,4}
 b[]={1,2,3,4}
output: a and b are equal */

import java.util.*;
public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i =0 ; i<a.length ; i++){
            a[i] = sc.nextInt();
        }
        int b[] = new int[n];
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        boolean x = true;
        for (int i = 0; i < b.length; i++) {
            
        if (a[i]==(b[i])) {
            x = true;
        }
        else
        x = false;
    }
    if (x==true){
        System.out.println("a and b are equal");
    }
    else
    System.out.println("not equal");
    }
}
