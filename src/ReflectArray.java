import java.lang.reflect.Array;
import java.util.Arrays;

public class ReflectArray {
    public static void main(String[] args) {
        int sizeofArray = 5;

        int[] intArray = (int[]) Array.newInstance(int.class, sizeofArray);

        System.out.println(Arrays.toString(intArray));
    }
}
