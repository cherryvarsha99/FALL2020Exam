/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question06;

import java.util.Scanner;

/**
 *
 * @author sai varsha Vellanki
 */
public class PentagonAreaCalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length from the center to a vertex: ");
        double length = scan.nextDouble();
        // formula to calculate side of pentagon
        double side = 2 * length * Math.sin(Math.PI / 5);
        // formula to calculate are of pentagon
        double area = (5 * side * side) / (4 * Math.tan(Math.PI / 5));

        System.out.println("The area of the pentagon is " + String.format("%.2f", area));
    }

}
