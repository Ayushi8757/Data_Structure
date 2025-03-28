public class sumOfDigit {
    public static int sum(int n){
        if(n==0){
            return 0;
        }  
        int s=sum(n/10);
        return s+n%10;
    }
    public static void main(String[] args) {
        //int n;
        int sum= sum(123);
        System.out.println(sum);   
    }
}
