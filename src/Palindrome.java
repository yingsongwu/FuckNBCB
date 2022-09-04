public class Palindrome {

    public static boolean judge (String str) {
        boolean flag = false;

        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(judge("agga"));
    }
}
