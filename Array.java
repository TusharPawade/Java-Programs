import java.util.*;
public class Array {
    public static int Search(int arr[], int n){
        for(int i = 0; i<arr.length ; i++){
            if (arr [i] == n) {
                return i;
            }
        }
        System.out.println("Element not found ");
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print("Enter elements of array : ");
        for (int i = 0 ; i<=x ; i++)
        arr [i] = sc.nextInt();
        int n = sc.nextInt();
        int res = Search(arr, n);
        if (res != -1) {
            System.out.println("Element found at index : "+res);
        }
        

        
    }

}
