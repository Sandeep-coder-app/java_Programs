import java.lang.reflect.Array;
import java.util.Arrays;

public class reflectArrays {
    public static void main(String[] args) {
        int sizeofArray = 3;
        int[] intArray = (int[]) Array.newInstance(int.class, sizeofArray);

        Array.setInt(intArray,0,10);
        Array.setInt(intArray,1,20);
        Array.setInt(intArray,2,30);

        System.out.println(Arrays.toString(intArray));
    }
}
