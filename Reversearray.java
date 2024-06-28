public class Reversearray {
    public static void Swap(int arr []){
        int start = 0;
        int end = arr.length -1;
        while (start < end) {
            int temp = arr [start];
            arr [start] = arr [end];
            arr [end] = temp;  
            
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr [] = {2,4,6,8,10};
        Swap(arr);
        for(int i=0 ; i<arr.length ; i++){
            System.out.println(arr [i]);
        }
    }
}