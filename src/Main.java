import pack.DataStructures;
import pack.JavaClass;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        JavaClass javaClass = new JavaClass(1, "testName", 1.0);
        //javaClass.functionF();
        //javaClass.functionN();

        Field field = JavaClass.class.getDeclaredField("name");
        field.setAccessible(true);
        String nameFromJavaClass = String.valueOf(field.get(javaClass));
        //System.out.println(nameFromJavaClass);

        DataStructures dataStructures = new DataStructures();
        //System.out.println(dataStructures.findEl(new int[]{11 , 1, 10}, 10));

        int[] list = dataStructures.returnList(new int[]{1, 2, 3, 4, 5}, 4);
        //System.out.println(Arrays.toString(list));

        System.out.println(dataStructures.binarySearch(new int[]{1, 2, 3, 4, 5}, 0, 4, 5));
    }
}