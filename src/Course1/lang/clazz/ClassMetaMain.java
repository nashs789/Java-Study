package Course1.lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = String.class;  // 1. 클래스 조회
        // Class clazz = new String().getClass();  // 2. 인스턴스에서 조회
        // Class clazz = Class.forName("java.lang.String");  // 3. 문자열로 조회

        Field[] fields = clazz.getDeclaredFields();

        for(Field field : fields) {
            System.out.println(field.getType() + " " + field.getName());
        }

        Method[] methods = clazz.getDeclaredMethods();

        for(Method method : methods) {
            System.out.println(method);
        }

        System.out.println(clazz.getSuperclass());

        Class[] interfaces = clazz.getInterfaces();

        for(Class inter : interfaces) {
            System.out.println(inter.getName());
        }
    }
}
