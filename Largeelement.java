// import java.util.*;
// public class Largeelement {
/*    public static void main(String[] args) {
        int arr[] = {4,5,7,9,2,8,1,0};
        int largest = 0; 
        int smallest = 1000000000;
        for(int i =0 ; i<arr.length ; i++){
            if (largest < arr[i]) {
                largest = arr[i];
            }
            if (smallest > arr[i]){
                smallest = arr[i];
            }
        }
        System.out.println("Largest : "+largest);
        System.out.println("Smallest : "+smallest);
    }
}
*/
import java.util.*;
public class Largeelement {

    public static int Array(int arr[] ){
        int largest = 0;
        int smallest = 1000000;
        for(int i=0 ;i< arr.length ;i++){
            if (largest < arr[i]){
            largest = arr[i];
        }
        if (smallest > arr[i]) {
            smallest = arr[i];
        }
    }
    System.out.println("smallest is "+smallest);
    return largest;
    }       
    
    public static void main(String[] args) {
        int arr[] = {4,5,7,9,2,8,1,0};

        System.out.println(Array(arr));
        
    }
}
