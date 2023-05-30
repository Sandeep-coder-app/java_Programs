package DSA;

public class bubbleSort {
    void bubble(int[] arr)
    {
        int n = arr.length;
        for(int i=0; i<n-1; i++)
            for(int j=0; j<n-i-1; j++)
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

    void printArrays(int[] arr)
    {
        int n = arr.length;
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        bubbleSort obj = new bubbleSort();
        int[] arr = {64,34,25,12,22,11,90};
        obj.bubble(arr);
        System.out.println("Sorted Arrays");
        obj.printArrays(arr);
    }
}
