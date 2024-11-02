

public class Ascending {
    public static void main(String[] args) {
        int arr[]={7,6,3,5,8,1};
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                    if(arr[i]>arr[j]){
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
            }
        }
        System.out.println("Ascending Order ");
        for(int i=0;i<arr.length ;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
