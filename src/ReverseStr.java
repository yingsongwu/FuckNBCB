public class ReverseStr {
    public static String solve (String str) {
        if (str == null || str.length() == 0)
            return str;
        String result = "";
        result = new StringBuilder(str).reverse().toString();
        return result;
    }

    public static String solve2 (String str) {
        String result = "";

        char [] chars = str.toCharArray();
        StringBuffer sb = new StringBuffer();

        for (int i = chars.length-1; i >= 0; i--) {
            sb.append(chars[i]);
        }
        result = sb.toString();
        return result;
    }

    public static void main(String[] args) {
        //稀疏数组
        //sparse array
        System.out.println(solve2("123456789"));
    }
}
