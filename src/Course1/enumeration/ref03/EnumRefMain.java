package Course1.enumeration.ref03;

public class EnumRefMain {
    public static void main(String[] args) {
        int price = 10000;

        for(Grade grade: Grade.values()) {
            printDiscount(grade, price);
        }
    }

    private static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() + " 할인 금액: " + grade.discount(price));
    }
}
