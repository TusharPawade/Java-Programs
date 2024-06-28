/* Write a Program to Reverse a String.  
Input: “ABCD” 
Output: DCBA  */

public class Q3 {
 public static void main(String[] args) {
    String s = "ABCD";
    for (int i = s.length()-1 ; i >= 0 ; i--) {
        System.out.print(s.charAt(i));  
    }
    

 }   
}
