import java.util.*;
public class two {
    public static void search(int arr [][] , int m , int n ,int z){
        for (int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ;j++){
                if (arr[i][j] == z) {
                    System.out.println("Element present at index "+i+","+j);
                }
            }
            System.out.println();
        }
    }

    public static int isLargest(int arr [][] , int m ,int n ){
        int y = 0 ;
        for (int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ;j++){
                if (y <= arr[i][j]) {
                    y = arr[i][j];
                }
               
            }
            
        }
        System.out.println("Largest = "+y);
        return y;
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int m = x.nextInt();
        int n = x.nextInt();
        int arr[][]= new int[m][n];
        for (int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ;j++){
                arr[i][j] = x.nextInt();
            }
        }
        for (int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        int z = x.nextInt();

        search(arr, m, n, z);
        isLargest(arr, m, n );
        
    }    
}
