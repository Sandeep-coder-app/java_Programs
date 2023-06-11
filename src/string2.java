import java.util.ArrayList;
import java.util.StringJoiner;

public class string2 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("Ram");
        al.add("shyam");
        al.add("alice");
        al.add("bob");

        StringJoiner sj1 = new StringJoiner(",");

        sj1.setEmptyValue("sj1 is empty");
        System.out.println(sj1);

        sj1.add(al.get(0)).add(al.get(1));
        System.out.println(sj1);

        System.out.println("Length of "+sj1.length());

        StringJoiner sj2 = new StringJoiner(":");
        sj2.add(al.get(2)).add(al.get(3));

        sj1.merge(sj2);

        System.out.println(sj1.toString());

        System.out.println("Length of new :"+sj1.length());
    }
}
