/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question13;

/**
 *
 * @author Sai varsha Vellanki
 */
public class CrediCardPatterns {

    /**
     * Return true if the card number is valid
     *
     * @param number
     * @return
     */
    public static boolean isValid(long number) {
// getting first digit of credit card number
        long v = getPrefix(number, 1);
       // checking condition if credit card number starting digit <4 
        if (v < 4) {

            return false;
        }
        //checking condition if credit card number starting digit >6 & not equal to 37 
        else if (v > 6 && getPrefix(number, 2) != 37) {

            return false;

        } 
        // checking if card number length should not be  <13 and > 16 
        else if (getSize(number) < 13 || getSize(number) > 16) {

            return false;
        }
        // checking condition if sum of even place digits and odd place digits should be divided by 10 
        else if ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 != 0) {

            return false;
        }

        return true;
    }

    /**
     * Get the result from Step 2
     *
     * @param number
     * @return
     */
    public static int sumOfDoubleEvenPlace(long number) {
        int sumOfDoubleEvenPlace = 0;
// caslculating sum of even place digits sum 
        for (int i = 0; i < 16; i++) {
          // checking if the digit is divided by 2 
          if (i % 2 == 0) {
                sumOfDoubleEvenPlace = sumOfDoubleEvenPlace + getDigit((int) (number % 10) * 2);
                number = number / 10;

            }
        }

        return sumOfDoubleEvenPlace;

    }
// return this number if it is a single digit, otherwise, return the sum of the two digits

    /**
     *
     * @param number
     * @return
     */
    public static int getDigit(int number) {
      // checking if the given number is <10 or not 
      if (number < 10) {
            return number;
        } 
      //checking if it is not <10 and calculating sum of two digits in number 
      else {
            int sum = 0;

            while (number != 0) {
                sum = sum + (number % 10);
                number = number / 10;
            }

            return sum;
        }

    }

    /**
     * Return sum of odd-place digits in number
     *
     * @param number
     * @return
     */
    public static int sumOfOddPlace(long number) {
        int sumOfOddPlace = 0;
       // calculating sum of even place digits
        for (int i = 1; i <= 16; i++) {
      // checking if digit is not divided by 2 then it is odd number
       if (i % 2 == 1) {
                sumOfOddPlace = sumOfOddPlace + (int) (number % 10);
            }
            number = number / 10;
        }
        return sumOfOddPlace;

    }

    /**
     * Return true if the digit d is a prefix for number
     *
     * @param number
     * @param d
     * @return
     */
    public static boolean prefixMatched(long number, int d) 
    {
       //checking that the given number perfeix matching with the passed second parameter value
        if (getPrefix(number, 1) == d || getPrefix(number, 2) == d) {
            return true;
        } else {
            return false;
        }
    }

// return the number of digits in d
    /**
     *
     * @param d
     * @return
     */
    public static int getSize(long d) {

        int n = 0;
        
     // checking the length of the card number    
        while (d != 0) {
            n++;
            d = d / 10;
        }
        return n;
    }

    /**
     * * Return the first k number of digits from number.If the number of digits
     * in number is less than k, return number.
     *
     * @param number
     * @param k
     * @return
     */
    public static long getPrefix(long number, int k) {
       //checking the number to get   first digit and second digit
       if (k == 1) {
            return number / 1000000000000000L;
        } else if (k == 2) {
            return number / 100000000000000L;
        }
        return 0;
    }
}
