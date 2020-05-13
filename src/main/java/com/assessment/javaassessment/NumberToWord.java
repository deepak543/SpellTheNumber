package com.assessment.javaassessment;
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
        numInWord.append(convertNumberUnitToWord((int) (number % 100), ""));

        return numInWord.toString();
    }


    public static void main(String[] args) {

        long number = 12;


        System.out.println(spellNumber(number));

    }

}
