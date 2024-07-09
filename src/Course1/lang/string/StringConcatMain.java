package Course1.lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "hello";
        String b = " java";

        String res1 = a + b;
        String res2 = a.concat(b);

        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);
    }
}
