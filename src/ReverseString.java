public class ReverseString {

    public static void main(String[] args) {

        char[] reverse = {'h','e','l','l','o'};
        reverseString(reverse);

    }

    private static void reverseString(char[] s) {
        int b = s.length - 1, a = 0;
         while (a < b){
            char tmp = s[a];
            s[a] = s[b];
            s[b] = tmp;
            a++; b--;
        }
    }

}
