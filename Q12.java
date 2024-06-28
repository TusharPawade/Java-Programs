/* Write a Program to Count Number of Even and Odd Digits in a Number. 
Input: 1234 
Output: Even Numbers:2 
        Odd Numbers: 2 */

        import java.util.*;
        class HelloWorld {
            public static void main(String[] args) {
                Scanner sc = new Scanner (System.in);
                int n =sc.nextInt();
                int countEven= 0;
                int countOdd = 0 ;
                while(n>0){
                    int digit = n%10;
                    n/=10;
                    if(digit%2 == 0 ){
                        countEven++;
                    }
                    else
                    {
                        countOdd++;   
                    }
                }
                System.out.println("Even = "+countEven);
                System.out.println("Odd = "+countOdd);
            }
        }