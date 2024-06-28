import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        while (x>0) {
        int lastdigit = x % 10 ;
        System.out.print(lastdigit);
        x = x/10;
        }
        //System.out.println();
    }
    
}
