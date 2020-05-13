package com.assessment.javaassessment;

import java.util.Scanner;

/**
 * A class that spells the given Number in words.
 * Example :- an input 12 yields Twelve as output
 * @author Deepak Selvakumar - dd.deepak06@gmail.com
 * https://github.com/deepak543/SpellTheNumber
 */
public class NumberToWord {
    /**
     * The Ones string array that stores numbers in words till nineteen
     */
    static String ones[] = {"", "One ", "Two ", "Three ", "Four ",
            "Five ", "Six ", "Seven ", "Eight ",
            "Nine ", "Ten ", "Eleven ", "Twelve ",
            "Thirteen ", "Fourteen ", "Fifteen ",
            "Sixteen ", "Seventeen ", "Eighteen ",
            "Nineteen "
    };


    /**
     * The Tens string array that stores tens string till ninety
     */
    static String tens[] = {"", "", "Twenty ", "Thirty ", "Forty ",
            "Fifty ", "Sixty ", "Seventy ", "Eighty ",
            "Ninety "
    };


    /**
     * Convert number unit to word string.
     *
     * @param number the number to be converted
     * @param s      the unit string
     * @return the converted string
     */
    static String convertNumberUnitToWord(int number, String s) {
        StringBuilder word = new StringBuilder();
        if (number > 19) {
            word.append(tens[number / 10] + ones[number % 10]);
        } else {
            word.append(ones[number]);
        }
        if (number != 0) {
            word.append(s);
        }

        return word.toString();
    }


    /**
     * Spell the given number in words as string.
     *
     * @param number the number
     * @return the string
     */
    public static String spellNumber(long number) {

        StringBuilder numInWord = new StringBuilder();

        numInWord.append( convertNumberUnitToWord((int) (number / 10000000), "Crore "));


        numInWord.append(convertNumberUnitToWord((int) ((number / 100000) % 100), "Lakh "));


        numInWord.append(convertNumberUnitToWord((int) ((number / 1000) % 100), "Thousand "));


        numInWord.append(convertNumberUnitToWord((int) ((number / 100) % 10), "Hundred "));

        if (number > 100 && number % 100 > 0) {
            numInWord.append("and ");
        }


        numInWord.append(convertNumberUnitToWord((int) (number % 100), ""));

        return numInWord.toString();
    }


    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        System.out.println(spellNumber(number));

    }

}
