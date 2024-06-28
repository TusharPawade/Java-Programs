import java.util.*;
public class Pyramid {
    public static void Star(int n){
        for (int i=1 ; i<n ; i++) {
            for (int j=1 ; j<=n-i ; j++){
                System.out.print(" ");  //Spaces
            }
            for (int j=1 ; j<=i ;j++){
                System.out.print("*");  //Stars
            }
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        Star(n);
    }
}
