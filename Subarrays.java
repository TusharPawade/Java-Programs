public class Subarrays {
    public static void Array(int arr []) {
        int ts = 0;
        int maxsum =  Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length ; i++){
            int start = i;
            for(int j=i ; j<arr.length ; j++){
                int end = j;
                ts++;
                int sum= 0;
                for(int k=start; k<=end ; k++){
                    System.out.print( arr[k]+ " " );
                    sum = sum + arr[k];
                    if (sum>maxsum) {
                        maxsum=sum;
                    }
                }
                System.out.println(" Sum = " +sum);
                System.out.println();
            }
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
        }
        System.out.println("Total Subarrays = "+ts);
        System.out.println("Maximum sum = "+maxsum);

    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        Array(arr);
    }
    
}
