package DSA;

public class interpolationSearch {
    public static int search(int[] arr, int x)
    {
        int lo = 0;
        int hi = arr.length - 1;
        int pos = -1;

        while(lo<=hi)
        {
            pos = lo+((hi-lo)/(arr[hi] - arr[lo])) * (x - arr[lo]);

            if(arr[pos] == x)
                return pos;

            if(arr[pos] < x)
                lo = pos + 1;

            if(arr[pos] > x)
                hi = pos - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10,12,13,16,18,19,20,21,22,23,24,33,35,42,47};
        int x = 18;

        int result = search(arr, x);

        if(result == -1)
            System.out.println("Element is not found");
        else
            System.out.println("Element found at index "+result);
    }
}
