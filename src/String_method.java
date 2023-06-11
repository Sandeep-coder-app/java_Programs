public class String_method {
    public static void main(String[] args) {
        String s = "Hello, World";

        System.out.println("String length = "+s.length());

        System.out.println("Character at 3rd position = "+s.charAt(3));

        System.out.println("Substring "+s.substring(3));

        System.out.println("Substring "+s.substring(2,5));

        String s1 = "Vanished";
        String s2 = "Super";

        System.out.println("Concatenated String = "+s1.concat(s2));

        String s4 = "Learn Share Learn";
        System.out.println("Index of share "+s4.indexOf("share"));

        System.out.println("Index of a = "+s4.indexOf('a',3));

        Boolean out = "Hello".equals("hello");
        System.out.println("Checking Equality "+out);
        out = "Hello".equals("hello");
        System.out.println(out);

        out = "Hello".equalsIgnoreCase("hEllo");
        System.out.println("checking Equality "+out);
    }
}
