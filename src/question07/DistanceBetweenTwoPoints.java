/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question07;

import java.text.DecimalFormat;
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
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        String A=scan.nextLine();
        String[]  resX=A.split(", ");
        double x1 = Double.parseDouble(resX[0]);
        
        double y1 = Double.parseDouble(resX[1]);
        
        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        String B=scan.nextLine();
        String[]  resY=B.split(", ");
        double x2 = Double.parseDouble(resY[0]);
        
        double y2 = Double.parseDouble(resY[1]);
        

        // formula to calculate distance between the given points
        double distance = 6371.01 * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2))
                + Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2))
                * Math.cos(Math.toRadians(y1) - Math.toRadians(y2)));

        System.out.println("The distance between the two points is  " +distance+" Km");

    }

}
