/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg29.pkg5.pkg2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numertor;
        int denomaintor;

        while (true) {
            try {
                System.out.print("Enter numerator: ");
                numertor = Integer.parseInt(sc.nextLine().trim());
                break;
            } catch (Exception e) {
                System.out.println("Enter integer number");
            }
        }
        while (true) {
            try {
                System.out.print("Enter denomainator: ");
                denomaintor = Integer.parseInt(sc.nextLine());
                if (denomaintor == 0) {
                    System.out.println("The denominator must be different from 0");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Enter integer number");
            }

        }
        Fraction f = new Fraction();
        Fraction f1 = new Fraction(numertor, denomaintor);
        System.out.println("Before completing the fraction: " + f1.getNumerator() + "/" + f1.getDenominator());
        f = f1.shortenFraction();
        System.out.println("After completing the fraction: " + f.getNumerator() + "/" + f.getDenominator());
    }

}
