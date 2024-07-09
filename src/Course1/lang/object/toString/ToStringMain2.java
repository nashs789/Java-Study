package Course1.lang.object.toString;

public class ToStringMain2 {

    public static void main(String[] args) {
        Car car = new Car("Model Y");
        Dog dogA = new Dog("DogA", 2);
        Dog dogB = new Dog("DogB", 5);

        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString());
        System.out.println(dogA.toString());
        System.out.println(dogB.toString());

        System.out.println("2. 내부 메소드에서 호출되는 toString");
        System.out.println(car);
        System.out.println(dogA);
        System.out.println(dogB);

        System.out.println("3. Object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dogA);
        ObjectPrinter.print(dogB);

        System.out.println("4. 참조 값 확값");
        System.out.println(System.identityHashCode(dogA));
        System.out.println(Integer.toHexString(System.identityHashCode(dogA)));
        System.out.println(dogA.hashCode());
        System.out.println(Integer.toHexString(dogA.hashCode()));
    }
}
