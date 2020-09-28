/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question01;

/**
 *
 * @author Sai Varsha Vellanki
 */
public class DemonstrateJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       System.out.println("This is syntax error where s in 'system'  should be Capital letter since system is a class   ");
        
        int i=5;
        // here we are trying to divide integer value 5 with zero which doesnot have any syntax error but in runtime we will get an exception
        System.out.println(i%0);
        // Logical errors are kind of run time errors 
       // if  the result expected is positive number and the result we got here is  -ve number then we can consider this as logical error
        System.out.println(i-7);
        
    }
    
}
