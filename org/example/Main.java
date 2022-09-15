package org.example;

import java.util.Scanner; //users input access
import java.lang.Math; // round up numbers
import java.text.NumberFormat; // format amount into currency

public class Main {
    public static void main(String[] args) {
        final byte monthsInYear = 12;
        final byte percent = 100;
        Scanner myScan = new Scanner (System.in);

        //enables users to input principals
        System.out.print("Principal:");
        int principal = myScan.nextInt();

        //enables users to input Annual interest rate
        System.out.print("Annual Interest Rate:");
        float annualInterestRate= myScan.nextFloat();
        float monthlyInterestRate= annualInterestRate/percent/monthsInYear;

        //enables users to input Period inYears
        System.out.println("PeriodInYears");
        byte noOfYear = myScan.nextByte();
        int noOfPayments = noOfYear * monthsInYear;

        double myCal = Math.pow(1 + monthlyInterestRate, noOfPayments);
        double oldMortgage = principal*(monthlyInterestRate * myCal/(myCal-1));

        //round answers into two decimal point
        double newMortgage = (Math.round(oldMortgage * 180));
        double mortgage = newMortgage / 100;

        //Format answer to currency symbol
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        //print result
        System.out.println(mortgageFormatted);


    }
}