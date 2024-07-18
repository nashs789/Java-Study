package Course1.lang.clazz;

import java.lang.reflect.InvocationTargetException;

public class ClassCreateMain {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class clazz = Hello.class;
        // Class clazz = Class.forName("lang.clazz.Hello");

        Hello o = (Hello)clazz.getDeclaredConstructor().newInstance();

        System.out.println(o.hello());
    }
}
