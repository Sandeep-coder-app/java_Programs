package DSA;

public class binarySearch {
    public static int binary_search(int[] arr, int x)
    {
        int l = 0;
        int r = arr.length - 1;

        while(l <= r)
        {
            int mid = l+(r-l)/2;
            if(arr[mid] == x)
                return mid;
            if(arr[mid] < x)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,10,40};
        int x = 40;
        int result = binary_search(arr,x);

        if(result == -1)
            System.out.println("Element is not present");
        else
            System.out.println("Element found at index "+result);
    }
}
