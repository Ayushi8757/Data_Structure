
public class Minimum {
    public static void main(String[] args) {
        int arr[]={7,5,1,8,2};
        int min=arr[0];
        for(int i:arr){
            if(i<min){
                min=i;
            }
        }
        System.err.println("Minimum = "+min);
    }
}
