public class CountDigit {
    public static int Digit(int n) {
        if (n == 0) {
            return 0;
        }
        int d = Digit(n / 10);
        return d + 1;
    }

    public static void main(String[] args) {
        int digit = Digit(12345);
        System.out.println("Number of digit : " + digit);
    }
}
