public class Maximum {
    public static void main(String[] args) {
        int arr[]={7,5,11,28,2};
        int max=arr[0];
        for(int i:arr){
            if(i>max){
                max=i;
            }
        }
        System.out.println("Maximum = "+max);
    }
}
