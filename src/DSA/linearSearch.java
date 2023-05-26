package DSA;

public class linearSearch {
    public static int search(int[] arr, int x) {
        int n = arr.length;

        for(int i = 0; i<n; i++)
        {
            //if condition to check the element present or not
            if(arr[i] == x)
                return i;
        }
        //element is not present in the array return -1
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,10,40};
        int x = 10;
        int result = search(arr, x);

        //if check the condition result is true or false
        if(result == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present in index "+result);
    }
}
