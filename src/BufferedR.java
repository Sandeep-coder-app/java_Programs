import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedR {
    public static void main(String[] args) throws IOException {
//        InputStreamReader input = new InputStreamReader(System.in);
//
//        BufferedReader br = new BufferedReader(input);
//
//        String name = br.readLine();
//
//        System.out.println("Name: "+name);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name;
        try{
            System.out.println("Enter your name");
            name = br.readLine();
            System.out.println("Name = "+name);
        } catch (Exception e) {e.getMessage();}
    }
}
