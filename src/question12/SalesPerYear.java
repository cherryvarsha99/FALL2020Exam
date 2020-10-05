/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question12;

import java.util.Scanner;

/**
 *
 * @author sai varsha vellanki
 */
public class SalesPerYear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double commission = 0;
        double earnings = 30000;

        // minimum sales amount is 0.01 
        double SalesAmount = 0.0;
        

        // using do- while  to calculate commission   
        do {
            // checking  condition 0>amount <=5000  
            if (SalesAmount <= 5000 && SalesAmount > 0) {
                commission = SalesAmount * 0.08;

            } // checking condition for 10000<=amount >=5000
            else if (SalesAmount >= 5000.01 && SalesAmount <= 10000) {
                commission = 5000 * 0.08+ (SalesAmount -5000)* 0.1;

            } //checking condition for amount >10000
            else {
                commission = 5000 * 0.08 + 5000 * 0.1 + (SalesAmount - 10000) * 0.12;

            }
            SalesAmount++;
          

            // using while to satisfy that comission  should be  30000       
        } while (commission < earnings);

        // displaying no of sales that took to earn 30000 and the sales amount as well
        System.out.println("minimum No of Sales  is:" + SalesAmount);

       

    }

}
