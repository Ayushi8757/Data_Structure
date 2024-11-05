public class secondMax {
    public static void main(String[] args) {
        int arr[]={1,7,56,9,34,63};
        int value= Max(arr);
        System.out.println(value);
    }
    public static int Max(int []arr){
        int max=arr[0];
        int smax=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                smax=max;
                max=arr[i];
            }
            else if(arr[i]>smax && arr[i]<max){
                smax=arr[i];
            }
        }
        return smax;
    }
}
