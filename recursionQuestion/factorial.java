import java.util.Scanner;
public class factorial {
   public static int fact(int n){
        if(n<=0){
            return 1;
        } 
       return n*fact(n-1);  
     }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int factorial= fact(n);
        System.out.println("Factorial of "+ n +" is "+ factorial);
    }
}
