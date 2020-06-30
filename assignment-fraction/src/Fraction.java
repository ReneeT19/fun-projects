import java.util.Scanner;

public class Fraction {
    //instance variables
    int numerator, denominator;

    //constructors
    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    //methods
    public Fraction add(Fraction fractionObject) {
        this.numerator = numerator * fractionObject.denominator + fractionObject.numerator * denominator;
        this.denominator = denominator * fractionObject.denominator;
//        return Fraction new Fraction(this.numerator, this.denominator);
        return this;
    }

    public Fraction multiply(Fraction fractionObject) {
        this.numerator = this.numerator * fractionObject.numerator;
        this.denominator = this.denominator * fractionObject.denominator;
//        return new Fraction(this.numerator, this.denominator);
        return this;
    }

    public void print() {
        if (this.denominator != 0) {
            System.out.println(this.numerator + "/" + this.denominator);
        }
    }

    public void printAsDouble() {
        if (this.denominator != 0) {
            System.out.println((double)this.numerator / (double)this.denominator);
        } else {
            System.out.println("infinity");
        }
    }

    //mutators and accessors
    public void setNumerator(int num) {
        this.numerator = num;
    }
    public void setDenominator(int den) {
        this.denominator = den;
    }
    public int getNumerator() {
        return this.numerator;
    }
    public int getDenominator() {
        return this.denominator;
    }
}

