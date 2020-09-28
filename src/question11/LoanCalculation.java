/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;

import java.util.Scanner;

/**
 *
 * @author Sai varsha Vellanki
 */
public class LoanCalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // scanning user iputs for loan amount, no of years and interest rate
        Scanner scan = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double amount = scan.nextDouble();
        System.out.print("Number of Years:  ");
        int years = scan.nextInt();
        System.out.print("Annual Interest Rate:   ");
        double annualInterestRate = scan.nextDouble();
        // calculating monthly interest rate   
        double monthlyInterestRate = annualInterestRate / 1200;
        // calculating monthly payement
        double monthlyPayment = amount * monthlyInterestRate / (1 - Math.pow(1 / (1 + monthlyInterestRate), years * 12));
        double balance = amount;

        // displaying monthly payement and total payment
        System.out.println("Monthly Payment: " + String.format("%.2f", (monthlyPayment * 100) / 100));

        System.out.println("Total Payment: " + String.format("%.2f", (monthlyPayment * 12 * years * 100) / 100));

        // diplaying payment details per year  
        System.out.println("payment# \tInterest \tPrincipal\tBalance");
        // using loop condition to get interest,principal,balance amount for respective years
        for (int i = 1; i <= years * 12; i++) {
            double interest = (monthlyInterestRate * balance * 100) / 100;
            double principal = (monthlyPayment - interest) * 100 / 100;

            balance = (balance - principal) * 100 / 100;
            System.out.println(i + "\t\t" + String.format("%.2f", interest) + "\t\t" + String.format("%.2f", principal) + "\t\t" + String.format("%.2f", balance));

        }

    }

}
