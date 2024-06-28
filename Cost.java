import java.util.*;
public class Cost {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float A = sc.nextFloat();
        float B = sc.nextFloat();
        float C = sc.nextFloat();
        float total = (A+B+C);
        System.out.println(total);
        //After tax Addition
        float Tot = total * 18/100;
        System.out.println(Tot); 
        
    };
    
}
