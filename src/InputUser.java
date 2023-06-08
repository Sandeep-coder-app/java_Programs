import java.util.Scanner;

public class InputUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your ID: ");
        int id = sc.nextInt();

        System.out.println("Enter your salary: ");
        float salary = sc.nextFloat();

        System.out.println("Name = "+name);
        System.out.println("ID = "+id);
        System.out.println("Salary = "+salary);

    }
}
