//Formatting output using System.out.printf()
public class javaFormatter {
    public static void main(String[] args) {
        int x = 100;
       // System.out.println("Printing simple integer x = %d\n"+x);

        //this will print it upto 2 decimal places
        System.out.format("Formatted with precision: PI = %.2f\n",Math.PI);

        float n = 5.2f;
        System.out.format("Formatted to specific with: n = %.4f\n", n);

        n = 2324435.3f;
        System.out.format("Formatted to right margin: n = %20.4f\n",n);
    }
}
