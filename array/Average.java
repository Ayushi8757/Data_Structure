public class Average {
    public static void main(String[] args) {
        int arr[]={10,20,30,23,45},s=0,A;
        for(int i:arr){
            s=s+i;
        }
        A=s/arr.length;
        System.out.println("Average= "+A);
    }
}
