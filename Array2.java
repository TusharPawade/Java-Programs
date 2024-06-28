import java.util.*;
public class Array2 {
    public static int Search(String arr [] , String str){
        for (int i = 0 ; i<=arr.length ;i++){
            if (arr[i] != null && arr[i].equals(str)) {
                return i;
            }
        }
        return -1;
    } 
public static void main(String[] args) {
    String arr [] = new String[10];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no. of Elements : ");
    int x = sc.nextInt();
    for (int i=0 ; i<=x ; i++){
        arr[i] = sc.next();
    }
    String str = sc.next();  
    System.out.println("index is "+Search(arr, str));

   //   OR
    // int res = Search(arr , str);

    // if (res != -1) {
    //     System.out.println("Element present at the index : "+res);
    // }
    // else
    // System.out.println("String not found ");

}
    
}