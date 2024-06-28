import java.util.Scanner;

public class Binarysearch {
    public static int Array(int arr[] , int n){
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if ( arr [mid] == n ) {
               return mid; 
            }
            if(arr[mid] < n){
                start = mid +1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
     public static void main(String[] args) {
        int arr [] = {2,4,6,8,10,12,14,16,18};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Array(arr, n));

    }
    
}
