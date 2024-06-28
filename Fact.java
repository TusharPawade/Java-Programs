// Write a program to find the factorial of any number entered by the user.
import java.util.*;
public class Fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int N = sc.nextInt();
        int fact = 1;
        for (int i = N ; i > 0 ; i-- ){
            fact = fact * i;
        }
        System.out.println(fact);


    }
}
