import java.text.DecimalFormat;

//Formatting using DecimalFormat Class
public class javaFormatter1 {
    public static void main(String[] args) {
        double num = 123.4567;

        DecimalFormat ft = new DecimalFormat("####");
        System.out.println("Without fraction part: num = "+ft.format(num));

        ft = new DecimalFormat("#.##");
        System.out.println("Formatted to give precision: num = "+ft.format(num));

        ft = new DecimalFormat("#.0000000");
        System.out.println("appended zeroes to right: num = "+ft.format(num));

        ft = new DecimalFormat("000000.00");
        System.out.println("Formatting Numeric part: num = "+ft.format(num));

        double income = 23456.789;
        ft = new DecimalFormat("###,###.##");
        System.out.println("Your formatted Dream Income: "+ft.format(income));
    }
}
