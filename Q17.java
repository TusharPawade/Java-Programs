import java.util.*;
public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            sum =sum+ a[i] ;
        }
        System.out.println(sum);
            
    }    
}
