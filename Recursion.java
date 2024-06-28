import java.util.*;
public class Recursion {
    public static void rec(int n){
        if (n==1){
            System.out.println(" "+1);
            return;
        }
        System.out.print(" "+n);
        rec(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        rec(n);
    }
}
