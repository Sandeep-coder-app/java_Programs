//Parameterized Constructor in java
public class prog1 {

    String name;
    int id;
    prog1(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args) {
        prog1 s1 = new prog1("Sandeep",101);

        System.out.println("Name: "+s1.name +"\n"+"ID: "+s1.id);
    }
}
