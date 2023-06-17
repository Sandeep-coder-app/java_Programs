public class method_overriding {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.m2();

        Parent a = new child();
        a.m2();
    }
}

class Parent {
    private void m1()
    {
        System.out.println("Form parent m1()");
    }

    protected void m2()
    {
        System.out.println("From parent m2()");
    }
}

class child extends Parent {
    private void m1()
    {
        System.out.println("From child m1()");
    }

    @Override public void m2()
    {
        System.out.println("From child m2()");
    }
}
