package Classes_and_objects;

public class Fraction {
    private int numerator;
    private int denominator;

    // Constructor
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator == 0) {
            // TODO: Handle error
            return;
        }
        this.denominator = denominator;
        simplify();
    }

    // Getter for numerator
    public int getNumerator() {
        return numerator;
    }

    // Setter for numerator
    public void setNumerator(int n) {
        this.numerator = n;
        simplify();
    }

    // Getter for denominator
    public int getDenominator() {
        return denominator;
    }

    // Setter for denominator
    public void setDenominator(int d) {
        if (d == 0) {
            // TODO: Handle error
            return;
        }
        this.denominator = d;
        simplify();
    }

    // Method to simplify the fraction
    private void simplify() {
        int gcd = 1;
        int smaller = Math.min(numerator, denominator);
        for (int i = 2; i <= smaller; i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                gcd = i;
            }
        }
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }

    // Method to add two fractions
    public static Fraction add(Fraction f1, Fraction f2) {
        int newNum = f1.numerator * f2.denominator + f2.numerator * f1.denominator;
        int newDen = f1.denominator * f2.denominator;
        return new Fraction(newNum, newDen);
    }

    // Method to add a fraction to the current fraction
    public void add(Fraction f2) {
        this.numerator = this.numerator * f2.denominator + this.denominator * f2.numerator;
        this.denominator = this.denominator * f2.denominator;
        simplify();
    }

    // Method to multiply the current fraction with another fraction
    public void multiply(Fraction f2) {
        this.numerator = this.numerator * f2.numerator;
        this.denominator = this.denominator * f2.denominator;
        simplify();
    }

    // Method to print the fraction
    public void print() {
        if (denominator == 1) {
            System.out.println(numerator);
        } else {
            System.out.println(numerator + "/" + denominator);
        }
    }
}
