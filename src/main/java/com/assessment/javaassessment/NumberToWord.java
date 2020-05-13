package com.assessment.javaassessment;

import java.util.Scanner;

public class NumberToWord {
    static String ones[] = {"", "One ", "Two ", "Three ", "Four ",
            "Five ", "Six ", "Seven ", "Eight ",
            "Nine ", "Ten ", "Eleven ", "Twelve ",
            "Thirteen ", "Fourteen ", "Fifteen ",
            "Sixteen ", "Seventeen ", "Eighteen ",
            "Nineteen "
    };


    static String tens[] = {"", "", "Twenty ", "Thirty ", "Forty ",
            "Fifty ", "Sixty ", "Seventy ", "Eighty ",
            "Ninety "
    };


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


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        System.out.println(spellNumber(number));

    }

}
