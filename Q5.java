public class Q5 {
    public static void main(String[] args) {
        int n = 1221;
        int original =  n;
        int rev = 0;
         while(n>0){
        int lastDigit = n%10;
        rev = rev*10 + lastDigit;
        n = n / 10;
        }
        if (original == rev){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        }
    
}
