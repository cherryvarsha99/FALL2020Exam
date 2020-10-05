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

        // checking condition if credit card number starting digit <4 
        if (prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 6) || prefixMatched(number, 37)) {

            // checking if card number length should not be  <13 and > 16 
            if (getSize(number) >= 13 && getSize(number) <= 16) {

                // checking condition if sum of even place digits and odd place digits should be divided by 10 
                if ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0) {

                    return true;
                }
            }
        }

        return false;
    }

    /**
     * Get the result from Step 2
     *
     * @param number
     * @return
     */
    public static int sumOfDoubleEvenPlace(long number) {
        int sumOfDoubleEvenPlace = 0;

        String str = number + "";
        // calculating sum of even place digits sum 
        int i = getSize(number) - 2;
        int count;
        while (i >= 0) {
            count = getDigit(Integer.parseInt(str.charAt(i) + "") * 2);
            sumOfDoubleEvenPlace = sumOfDoubleEvenPlace + count;
            i = i - 2;

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
        } //checking if it is not <10 and calculating sum of two digits in number 
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
        String str = number + "";
        // calculating sum of even place digits sum 
        int i = getSize(number) - 1;
        int count;
        while (i >= 0) {
            count = getDigit(Integer.parseInt(str.charAt(i) + ""));
            sumOfOddPlace = sumOfOddPlace + count;
            i = i - 2;

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
    public static boolean prefixMatched(long number, int d) {
        if (getPrefix(number, getSize(d)) == d) {
            return true;
        }
        return false;
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
     * * Return the first k number of digits from number.If the number of
     * digits in number is less than k, return number.
     *
     * @param number
     * @param k
     * @return
     */
    public static long getPrefix(long number, int k) {
        //checking the number to get   first digit and second digit
        int size = getSize(number);
        if (size > k) {
            String str = Long.toString(number);
            number = Long.parseLong(str.substring(0, k));
            return number;
        }
        return number;

    }
}
