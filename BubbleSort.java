public class BubbleSort {
    public static void sort(int Arr []){
        int count = 0;
        for (int i=0 ; i<Arr.length-1 ; i++){
            
            for (int j=0 ; j<Arr.length-1-i ; j++){
                if (Arr[j] > Arr[j+1]) {
                    int temp = Arr[j];
                    Arr[j] = Arr[j+1];
                    Arr[j+1] = temp;
                    count++;
                }
        }
        
    }
    System.out.println("count = "+count);
}
/*public static void print(int Arr[]) {
    for (int i = 0; i < Arr.length; i++) {
        System.out.print(Arr[i] + " ");
    }
    System.out.println();
} */
public static void main(String[] args) {
    int Arr [] = {5,4,1,3,2};
    sort(Arr);
    for (int i = 0; i < Arr.length; i++) {
        System.out.print(Arr[i] + " ");
    }
    System.out.println();
    //print(Arr);
}
}
