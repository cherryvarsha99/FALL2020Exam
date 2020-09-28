/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question05;

/**
 *
 * @author Sai Varsha Vellanki
 */
public class Combinations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count = 0;
        // we are checking for first number  in the matrix  which are less than seven
        for (int i = 1; i <= 7; i++) {
            // we are checking for second number in the matrix  which are less than seven 
            for (int j = 1; j <= 7; j++) {
                //  condition for  both numbers in matrix should not be same and the fist number less than second number  
                if (i != j && i < j) {
                    System.out.println(i + " " + j);
                    count++;
                }
            }
        }

        System.out.println("The total number of all combinations is " + count);

    }

}
