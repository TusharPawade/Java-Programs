/*Write a Program to Reverse a Number. 
Input: 1234 
Output: 4321  */
public class Q2 {
    public static void main(String[] args) {
      int s=1234;
      int rev =0;
        while(s>0){
            int lastdigit = s%10;
            rev = (rev*10) + lastdigit;
            s=s/10;
        }
    
        System.out.println(rev);
      
    }
    
}
