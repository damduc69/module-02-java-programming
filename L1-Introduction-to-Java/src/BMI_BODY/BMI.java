package BMI_BODY;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        double bmi, weight, height;

        System.out.print("Your wight: ");
        double weight = sc.nextDouble();

        System.out.print("Your height: ");
        double height = sc.nextDouble();

        double bmi = weight / (height * height);
        System.out.printf("%-20s%s", " bmi", "Interpretation\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}
