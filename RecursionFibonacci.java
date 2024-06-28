import java.util.*;
public class RecursionFibonacci {
    public static int fibonacci(int n){
        if (n==0 || n==1) {
            return n;
        }
        fibonacci(n-1);
        fibonacci(n-2);
        int sum = fibonacci(n-2) + fibonacci(n-1);
        return sum;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fibonacci(n));
    }
}