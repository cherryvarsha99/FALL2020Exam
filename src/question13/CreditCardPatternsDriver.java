/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question13;

import java.util.Scanner;

/**
 *
 * @author sai varsha vellanki
 */
public class CreditCardPatternsDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // scanning userinputs for credit card number
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a credit card number as a long integer:");
        long creditCardNum = scan.nextLong();
        // creating object for CreditCardPatterns class
        CrediCardPatterns CCP = new CrediCardPatterns();
        // checking condition if credit card numb is valid or not 
        if (CCP.isValid(creditCardNum)) {
            System.out.println(creditCardNum + "   is valid");

        } else {
            System.out.println(creditCardNum + "   is invalid");
        }

    }

}
