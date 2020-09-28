/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question04;

import java.util.Scanner;

/**
 *
 * @author sai varsha vellanki
 */
public class SocialSecurityNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int i;
        String SSN;
        boolean valid=false;
        Scanner scan= new Scanner(System.in);
        System.out.print("Enetr a SSN :");
        SSN = scan.nextLine();
        // using if condition to check the length of SSN number and the special characters '-' at specific index
        if (SSN.length() == 11&&(SSN.charAt(3) == '-' || SSN.charAt(6) == '-') )
        {
           
            // using loop to check  for all the characters in the given number 
            for (i = 0; i < 11; i++) 
                
            {
                // checking if 3rd char and 6th char in SSN is '-'
                if(i!=3&&i!=6){
                    // using condition to check the the remaing characters except 3 & 6 must be digits
                if(Character.isDigit(SSN.charAt(i)) )
           
                {
                      valid=true;
                     
                
                 }else{
                    valid=false;
                    break;
                }
            }
          
            
            }    


}
        //if the valid is true then it will print SSN is valid
      if(valid){
          System.out.println(SSN +" is a valid social security number");
      }  
      else 
            
 System.out.println(SSN +" is an invalid social security number");
            }
       
 }

