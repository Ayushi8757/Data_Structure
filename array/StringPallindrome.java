public class StringPallindrome {
    public static void main(String[] args) {
        String str = "aabaa";
        int n = str.length();
        String str1 = "";
        for (int i = n - 1; i >= 0; i--) {
            str1 = str1 + str.charAt(i);
        }
        if (str.equals(str1)) {
            System.out.println("String is Pallindrome = " + str1);
        } else {
            System.out.println("Not Pallindrome = " + str1);
        }
    }
}
