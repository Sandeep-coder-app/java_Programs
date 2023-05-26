package DSA;

public class linearSearch1 {
    public static void search(int[] arr, int search_element)
    {
        int left = 0;
        int length = arr.length;
        int right = length - 1;
        int position = -1;

        for(left = 0; left <= right;)
        {
            if(arr[left] == search_element)
            {
                position = left;
                System.out.println("Element found in array at "+(position + 1)+" position with "+(left + 1)+" Attempt");
                break;
            }

            if(arr[right] == search_element)
            {
                position = right;
                System.out.println("Element found in array at "+(position + 1)+" position with "+(length - right)+" Attempt");
                break;
            }
            left++;
            right--;
        }

        if(position == -1)
            System.out.println("Not found is array with "+left+" Attempt");
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int search_element = 5;

        search(arr,search_element);
    }
}
