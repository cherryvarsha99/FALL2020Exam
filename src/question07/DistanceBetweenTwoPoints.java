/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question07;

import java.util.Scanner;

/**
 *
 * @author Sai Varsha Vellanki
 */
public class DistanceBetweenTwoPoints {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scan = new Scanner(System.in);
    //scanning x points and y points 
        System.out.print("Enter point 1 (latitude and longitude) in degrees:");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        scan.nextLine();
        System.out.print("Enter point 2 (latitude and longitude) in degrees:");
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();

        // formula to calculate distance between the given points
        double distance = 6371.01 * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2))
                + Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2))
                * Math.cos(Math.toRadians(y1) - Math.toRadians(y2)));

        System.out.println(distance+"Km");

    }

}
