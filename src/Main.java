import pack.JavaClass;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        JavaClass javaClass = new JavaClass(1, "testName", 1.0);
        javaClass.functionF();
        javaClass.functionN();

        Field field = JavaClass.class.getDeclaredField("name");
        field.setAccessible(true);
        String nameFromJavaClass = String.valueOf(field.get(javaClass));
        System.out.println(nameFromJavaClass);
    }
}