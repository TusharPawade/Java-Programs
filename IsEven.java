/*Write a method named isEven that accepts an int argument. The method
 should return true if the argument is even, or false otherwise. Also write a program to test your
 method */

/*import java.util.*;
public class IsEven {
    public static boolean Even(int  n){
        if (n %2 == 0) {
            System.out.println("True");
            return true;   
        }
        else{
            System.out.println("False");
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Even(n);
        
    }   
}
*/

import java.util.*;
public class IsEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter an integer: ");
        num = sc.nextInt();

        if (isEven(num)) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
