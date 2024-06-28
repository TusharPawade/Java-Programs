public class Q6 {
    public static void main(String[] args) {
        String s = "Dad";
        String original = s.toLowerCase();
        String rev = "";
        for(int i = original.length()-1; i>=0 ; i--){
        rev =rev+ original.charAt(i);
        }
     
        //System.out.println(a);
        if(original.equals(rev)){
            System.out.println("True");
        }
        else
        System.out.println("False");
    
    }
}
