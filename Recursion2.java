
import java.util.*;
public class Recursion2 {
    public static void rec(int n){
        if (n==1){
            System.out.print(1);
            return;
        }
        rec(n-1);
        System.out.print(" "+n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        rec(n);
    }    
}
