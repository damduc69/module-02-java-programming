package Numbers_To_Words;

import java.util.Scanner;

public class NumbersToWords{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số cần đọc (0-999): ");
        int number = scanner.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("Out of ability");
        } else if (number < 10) {
            System.out.println(readUnit(number));
        } else if (number < 20) {
            System.out.println(readTeens(number));
        } else if (number < 100) {
            System.out.println(readTens(number));
        } else {
            System.out.println(readHundreds(number));
        }

        scanner.close();
    }

    private static String readUnit(int number) {
        return switch (number) {
            case 0 -> "zero";
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            case 4 -> "four";
            case 5 -> "five";
            case 6 -> "six";
            case 7 -> "seven";
            case 8 -> "eight";
            case 9 -> "nine";
            default -> "";
        };
    }

    private static String readTeens(int number) {
        return switch (number) {
            case 10 -> "ten";
            case 11 -> "eleven";
            case 12 -> "twelve";
            case 13 -> "thirteen";
            case 14 -> "fourteen";
            case 15 -> "fifteen";
            case 16 -> "sixteen";
            case 17 -> "seventeen";
            case 18 -> "eighteen";
            case 19 -> "nineteen";
            default -> "";
        };
    }

    private static String readTens(int number) {
        int tens = number / 10;
        int ones = number % 10;

        String tensWord = switch (tens) {
            case 2 -> "twenty";
            case 3 -> "thirty";
            case 4 -> "forty";
            case 5 -> "fifty";
            case 6 -> "sixty";
            case 7 -> "seventy";
            case 8 -> "eighty";
            case 9 -> "ninety";
            default -> "";
        };

        String onesWord = readUnit(ones);

        return ones == 0 ? tensWord : tensWord + " " + onesWord;
    }

    private static String readHundreds(int number) {
        int hundreds = number / 100;
        int remainder = number % 100;

        String hundredsWord = readUnit(hundreds) + " hundred";

        if (remainder == 0) {
            return hundredsWord;
        } else if (remainder < 10) {
            return hundredsWord + " and " + readUnit(remainder);
        } else if (remainder < 20) {
            return hundredsWord + " and " + readTeens(remainder);
        } else {
            return hundredsWord + " and " + readTens(remainder);
        }
    }
}
