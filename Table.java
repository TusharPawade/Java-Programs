//  WriteaprogramtoprintthemultiplicationtableofanumberN,enteredbythe user.
import java.util.*;
public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int N = sc.nextInt();

        for(int i=1 ; i<=10 ; i++){
            int Count = N*i;
            System.out.println(N+ " * " +i+ " = " +Count);
        }
        
    }
    
}
