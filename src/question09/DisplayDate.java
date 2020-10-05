/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question09;

import java.util.GregorianCalendar;
import java.util.Calendar;

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
        Calendar  gc = new GregorianCalendar();
        // here month starts from 0 and hence we are incrementing 1 to get correct month as per our calender
        int month=gc.get(Calendar.MONTH )+1;
        //using GregorianCalendar methods print year,month and day of month
        System.out.println("YEar:" + gc.get(GregorianCalendar.YEAR));
        System.out.println("MONTH:" + month );
        System.out.println("DAY:" + gc.get(GregorianCalendar.DAY_OF_MONTH));
        System.out.println("current year, month, and day is "+month + "/" + gc.get(GregorianCalendar.DAY_OF_MONTH) + "/" + gc.get(GregorianCalendar.YEAR));

        //setting date and time  to since January 1, 1970 to 1234567898765L  using setTimeMillis() from GregorianCalendar class 
        gc.setTimeInMillis(1234567898765L);
        // setter method sets the time to specific date and the new values will get printedx
        System.out.println("YEar:" + gc.get(GregorianCalendar.YEAR));
        System.out.println("MONTH:" + month);
        System.out.println("DAY:" + gc.get(GregorianCalendar.DAY_OF_MONTH));

        System.out.println("elapsed time since January 1, 1970. :"+month + "/" + gc.get(gc.DAY_OF_MONTH) + "/" + gc.get(gc.YEAR));

    }

}
