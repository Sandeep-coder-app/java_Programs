public class Array1 {
    public static void main(String[] args) {
        student[] st = new student[]{new student("Sandeep Singh"), new student("Akash Yadav"), new student("Shivam Singh")};

        for(student m:st){
            System.out.println(m);
        }
    }
}
