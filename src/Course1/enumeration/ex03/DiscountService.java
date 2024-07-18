package Course1.enumeration.ex03;

public class DiscountService {

    public int discount(Grade grade, int price) {
        int discountPercent = 0;

        if(grade == Grade.BASIC) {
            discountPercent = 10;
        } else if(grade == Grade.GOLD) {
            discountPercent = 20;
        } else if(grade == Grade.DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println(grade + " : 할인 x");
        }

        return price * discountPercent / 100;
    }
}
