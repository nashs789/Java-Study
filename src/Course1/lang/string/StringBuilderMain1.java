package Course1.lang.string;

public class StringBuilderMain1 {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder();

        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");

        System.out.println(sb);

        sb.insert(4, "Java");
        System.out.println(sb);

        sb.delete(4, 8);
        System.out.println(sb);

        System.out.println(sb.reverse());

        String str = sb.toString();
        System.out.println(str);
    }
}
