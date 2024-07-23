package Course1.enumeration.ex03;

public class EnumRefMain {
    public static void main(String[] args) {
        System.out.println("class basic = " + Grade.BASIC.getClass());
        System.out.println("class basic = " + Grade.GOLD.getClass());
        System.out.println("class basic = " + Grade.DIAMOND.getClass());

        System.out.println("ref BASIC = " + refValue(Grade.BASIC));
        System.out.println("ref BASIC = " + refValue(Grade.GOLD));
        System.out.println("ref BASIC = " + refValue(Grade.DIAMOND));
    }

    private static String refValue(Grade grade) {
        System.out.println(System.identityHashCode(grade));
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
