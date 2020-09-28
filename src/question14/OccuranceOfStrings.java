/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question14;

import java.util.Scanner;

/**
 *
 * @author sai varsha vellanki
 */
public class OccuranceOfStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //// created scanner object to read input from user for two strings
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String string1 = scan.nextLine();
        System.out.print("Enter string 2: ");
        String string2 = scan.nextLine();
        //calling counyStringOccurrence to find number of sub-string in main string
        int count = stringOccurrence(string1, string2);
        System.out.println("The number of occurrences of " + string2 + " in the above string are " + count);
        return;
    }

    public static int stringOccurrence(String string1, String string2) {
        int pointer = 0, occuranceCount = 0;
        //// to iterate until pointer reaches end of the main string
        while (true) {
            pointer = string1.indexOf(string2, pointer);
            // checking  condition that does  pointer  reached end of the main string
            if (pointer != -1) {
                occuranceCount++;
                //// pointer is incremented to sub string length indexes
                pointer = pointer + string2.length();
            } else {
                break;
            }
        }
        // returning  sub string coun
        return occuranceCount;

    }
}
