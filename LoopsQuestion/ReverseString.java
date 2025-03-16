public class ReverseString {
    
    public static void reverse(char[] s) {
        int n = s.length;
        for (int i = 0; i < n / 2; i++) {
            // Swap the characters
            char temp = s[i];
            s[i] = s[n - 1 - i];
            s[n - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        // Convert string to char array
        char[] str = "Hello".toCharArray();
        
        // Reverse the array
        reverse(str);
        
        // Print the reversed array
        System.out.println(new String(str)); // Convert the char array back to string and print
    }
}

