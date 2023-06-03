package Basic_Programs;
//Instance Variable
public class prog1 {
    public String geek;
    public prog1() {
        this.geek = "Sandeep Singh";
    }
    public static void main(String[] args) {
        prog1 obj = new prog1();

        System.out.println("Name: "+obj.geek);
    }
}
