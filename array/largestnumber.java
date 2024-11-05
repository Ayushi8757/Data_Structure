public class largestnumber {
    public static void main(String[] args) {
        int a=10,b=30,c=100;
        if(a>b && a>c){
            System.out.println("Largest Number = "+a);
        }
        else if(b>a && b>c){
            System.out.println("Largest Number = "+b);
        }
        else{
            System.out.println("Largest Number = "+c);
        }
    }
}
