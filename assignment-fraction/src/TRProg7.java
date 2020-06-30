import java.util.Scanner;

public class TRProg7 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Fraction c, d, x; // Fraction objects

        System.out.println("Enter numerator; then denominator.");
        c = new Fraction(stdIn.nextInt(), stdIn.nextInt());
        c.print();

        System.out.println("Enter numerator; then denominator.");
        d = new Fraction(stdIn.nextInt(), stdIn.nextInt());
        d.print();

        x = new Fraction(); // create a fraction for number 0

        System.out.println("Sum:");
        x.add(c).add(d);
        x.print();
        x.printAsDouble();

        x = new Fraction(1, 1); // create a fraction for number 1

        System.out.println("Product:");
        x.multiply(c).multiply(d);
        x.print();
        x.printAsDouble();

        System.out.println("Enter numerator; then denominator.");

        x = new Fraction(stdIn.nextInt(), stdIn.nextInt());
        x.printAsDouble();
    } // end main
}
