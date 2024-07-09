package Course1.lang.string;

public class StringBasicMain {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("Hello");
        String str3 = "Hello";
        String str4 = "Hello".intern();

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1 == str4);
    }
}
