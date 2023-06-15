//Java program to illustrate copy constructor
public class Complex {
    private double re,im;

    public Complex(double re, double im)
    {
        this.im = im;
        this.re = re;
    }

    Complex(Complex c)
    {
        System.out.println("copy constructor called");

        re = c.re;
        im = c.im;
    }

    @Override
    public String toString()
    {
        return "(" +re+" + "+im +"i)";
    }
    public static void main(String[] args) {
        Complex c1 = new Complex(10,15);

        Complex c2 = new Complex(c1);

        Complex c3 = c2;

        System.out.println(c2);
    }
}
