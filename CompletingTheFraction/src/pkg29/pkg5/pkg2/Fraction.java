/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg29.pkg5.pkg2;

/**
 *
 * @author lengu
 */
public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction() {

    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int findGreatestCommonDivisor(int numerator, int denominator) {

        if (numerator == 0 || denominator == 0) {
            return numerator + denominator;
        }
        while (numerator != denominator) {
            if (numerator > denominator) {
                numerator -= denominator;
            } else {
                denominator -= numerator;
            }
        }
        return numerator;
    }


    public Fraction shortenFraction() {
        
        int gcd = findGreatestCommonDivisor(numerator, denominator);
        int t = getNumerator() / gcd;
        int m = getDenominator() / gcd;
        Fraction tmp = new Fraction(t, m);
       
        return tmp;
    }

}
