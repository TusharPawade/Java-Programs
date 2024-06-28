import java.util.*;
public class RecursionSum {
    public static int sum(int n){
        if (n==0) {
            return 0;
        }
        sum(n-1);
        int add = n + sum(n-1);
        return add;
        }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
        
    }
}
