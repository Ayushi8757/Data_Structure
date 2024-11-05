public class MaxandSecondMax {
     public static void main(String[] args) {
        int arr[]={12,90,34,23,8};
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>max) {
                max=arr[i];
            } else if (arr[i]>smax) {
                smax=arr[i];
            }
        }
        System.out.println("Maximum = "+max);
        System.out.println("Second Maximum = "+smax);
     }
}
