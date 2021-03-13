public class ValidPalindrome {

    public static boolean isPalindrome() {

        String s= "A man, a plan, a canal: Panamaa";

        int a =0, b = s.length() - 1;

        while (a < b) {
            if(!Character.isLetterOrDigit(s.charAt(a)))
                a++;
            else if (!Character.isLetterOrDigit(s.charAt(b)))
                b--;
            else {
                if (Character.toLowerCase(s.charAt(a)) != Character.toLowerCase(s.charAt(b)))
                    return false;
                a++; b--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome());
    }
}
