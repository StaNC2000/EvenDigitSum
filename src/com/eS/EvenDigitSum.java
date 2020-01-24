package com.eS;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        int digit = number;
        int sum = 0;
        int reminder = 0;

        if (number < 0) {
            return -1;
        }

        while (digit > 0) {
            reminder = digit % 10;
            digit = digit / 10;
            if (reminder % 2 == 0) {
                sum = sum + reminder;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
	// write your code here
        System.out.println(getEvenDigitSum(252));
    }
}
