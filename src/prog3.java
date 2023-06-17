class Addition {
    int sum = 0;

    public int addTwoInt(int a, int b)
    {
        sum = a + b;

        return sum;
    }
}

public class prog3 {
    public static void main(String[] args) {

        Addition a = new Addition();

        int s = a.addTwoInt(10,5);

        System.out.println("Sum of two integer values: "+s);
    }
}
