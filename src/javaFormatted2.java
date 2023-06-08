import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class javaFormatted2 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
        String str = ft.format(new Date());
        System.out.println("Formatted Date: "+str);

//        str = "02/08/1995";
//        ft = new SimpleDateFormat("MM/dd/yyyy");
//        Date date = ft.parse(str);
//
//        System.out.println("Parsed Date: "+date);
    }
}
