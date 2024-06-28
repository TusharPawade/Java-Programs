import java.util.*;
public class Prictice{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int bit = 1;

        if ((a & bit)== 0) {
            System.out.println("Even");
        }                    
        else{
            System.out.println("Odd ");
        }
   }
}