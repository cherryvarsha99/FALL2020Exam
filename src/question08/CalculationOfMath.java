/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question08;

/**
 *
 * @author sai varsha vellanki
 */
public class CalculationOfMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        System.out.println(Math.sqrt(4));
        System.out.println(Math.sin(2 * Math.PI));
        System.out.println(Math.cos(2 * Math.PI));
        System.out.println(Math.pow(2, 2));
        System.out.println(Math.log(Math.E));
        System.out.println(Math.exp(1));
        System.out.println(Math.max(2, Math.min(3, 4)));
        System.out.println(Math.rint(-2.5));
        System.out.println(Math.ceil(-2.5));
        System.out.println(Math.floor(-2.5));
        System.out.println(Math.round(-2.5f));
        System.out.println(Math.round(-2.5));
        System.out.println(Math.rint(2.5));
        System.out.println(Math.ceil(2.5));
        System.out.println(Math.floor(2.5));
        System.out.println(Math.round(2.5f));
        System.out.println(Math.round(2.5));
        System.out.println(Math.round(Math.abs(-2.5)));

      // 8.5 question
        System.out.println("     8.5    ");
        System.out.println(34+(int)Math.random()* (55-34));
        System.out.println((int)Math.random() * 1000);
        System.out.println(5.5+Math.random() *(55.5 - 5.5));
        
        //8.7
        System.out.println("      8.7   ");
        System.out.println(Math.log(Math.exp(5.5)));
        System.out.println(Math.log(Math.exp(5.5)));
        System.out.println(Math.asin(Math.sin(Math.PI / 6)));
        System.out.println(Math.sin(Math.asin(Math.PI / 6)));
    }
}
