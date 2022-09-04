public class Rexiaoshu {
    public static void main(String[] args) {
        String str =  "||.123||.1||.01||0.02";
        System.out.println(str.replaceAll("\\|\\.", "|0."));
    }
}
