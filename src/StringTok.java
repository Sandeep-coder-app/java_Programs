import java.util.StringTokenizer;

public class StringTok {
    public static void main(String[] args) {
        System.out.println("Using Constructor 1 - ");

        StringTokenizer st1 = new StringTokenizer("Hello San How are you"," ");

        while(st1.hasMoreTokens())
            System.out.println(st1.nextToken());

        System.out.println("Using Constructor 2 - ");
        StringTokenizer str2 = new StringTokenizer("Java : code : String"," :");

        while(str2.hasMoreTokens())
            System.out.println(str2.nextToken());


    }
}
