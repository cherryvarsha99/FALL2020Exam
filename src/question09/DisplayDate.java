/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question09;

import java.util.GregorianCalendar;

/**
 *
 * @author Sai Varsha Vellanki
 */
public class DisplayDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //imported the  GregorianCalendar hence creating object  for that class
        GregorianCalendar gc = new GregorianCalendar();
        //using GregorianCalendar methods print year,month and day of month
        System.out.println("YEar:" + gc.get(GregorianCalendar.YEAR));
        System.out.println("MONTH:" + gc.get(GregorianCalendar.MONTH));
        System.out.println("DAY:" + gc.get(GregorianCalendar.DAY_OF_MONTH));
        System.out.println("current year, month, and day is "+gc.get(gc.MONTH) + "/" + gc.get(gc.DAY_OF_MONTH) + "/" + gc.get(gc.YEAR));

        //setting date and time  to since January 1, 1970 to 1234567898765L  using setTimeMillis() from GregorianCalendar class 
        gc.setTimeInMillis(1234567898765L);
        // setter method sets the time to specific date and the new values will get printedx
        System.out.println("YEar:" + gc.get(GregorianCalendar.YEAR));
        System.out.println("MONTH:" + gc.get(GregorianCalendar.MONTH));
        System.out.println("DAY:" + gc.get(GregorianCalendar.DAY_OF_MONTH));

        System.out.println("elapsed time since January 1, 1970. :"+gc.get(gc.MONTH) + "/" + gc.get(gc.DAY_OF_MONTH) + "/" + gc.get(gc.YEAR));

    }

}
