package Course1.lang.string.eqauls;

public class StringEqualsMain2 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println("method call with Instance = " + isSame(str1, str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("method call with Literal = " + isSame(str3, str4));

    }

    private static boolean isSame(String x, String y) {
        // return x == y;
        return x.equals(y);
    }
}
