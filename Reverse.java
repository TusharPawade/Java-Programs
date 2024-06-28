import java.util.*;
public class Reverse {
      public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int rev =0;
        while(x>0){
            int lastdigit = x%10;
            rev = (rev*10) + lastdigit;
            x=x/10;
        }
        System.out.println(rev);
      }   
    }
