package Course1.lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();

        child.childMethod();
        child.parentMethod();
        child.toString();

        String str = child.toString();
        System.out.println(str);
    }
}
