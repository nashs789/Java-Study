package Course1.enumeration.ref02;

import Course1.enumeration.ref01.DiscountService;

import static Course1.enumeration.ref01.Grade.*;

public class EnumRefMain {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        int basic = discountService.discount(BASIC, price);
        int gold = discountService.discount(GOLD, price);
        int diamond = discountService.discount(DIAMOND, price);

        System.out.println("basic = " + basic);
        System.out.println("gold = " + gold);
        System.out.println("diamond = " + diamond);
    }
}
