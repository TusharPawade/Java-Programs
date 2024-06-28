import java.util.*;
public class Hollow_Rectangle {

    public static void Star(int tr, int tc){
        for(int i=1 ; i<=tr ; i++){
            for (int j=1 ; j<=tc ; j++) {
                if (i==1 || i==tr || j==1 || j==tc) {
                    System.out.print("*");
                }
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter rows ");
        int r = sc.nextInt();
        System.out.println("Enter columns");
        int c = sc.nextInt();
        Star(r,c);
    }
}