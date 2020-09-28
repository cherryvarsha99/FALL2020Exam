/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question02;

/**
 *
 * @author Sai varsha Vellanki
 */
public class FanDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       // create object for Fan class and call getter methods 
        Fan f=new Fan();
        f.getSpeed();
        f.getColor();
        f.getRadius();
        f.isOn();
        //  printing the created object and the toString method will return  "Fan is OFF" since no values given in constructor 
       System.out.println(f); 
       // set values to the parameters using setter methods
        f.setSpeed(10);
        f.setRadius(5);
        f.setColor("Black");
        f.setOn(true);
        
        // print the same referenced object  aftr setting values
         System.out.println(f);
    }
    
}
