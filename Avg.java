//  Write a Java method to compute the average of three numbers..
import java.util.*;
public class Avg {
    public static void Average(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println((double)(a+b+c)/3); 
    }

public static void main(String[] args) {
    
    Average();
}
}
