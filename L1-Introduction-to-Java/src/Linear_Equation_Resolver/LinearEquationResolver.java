package Linear_Equation_Resolver;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x +b = c' , pls enter constants: ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a: ");
        double a = sc.nextDouble();

        System.out.println("Enter b: ");
        double b = sc.nextDouble();

        System.out.println("Enter c: ");
        double c = sc.nextDouble();

        if (a != 0){
            double answer = (c - b ) / a;
            System.out.println("The answer is: " + answer);
        } else {
            if(b == c){
                System.out.println("The solution is all x");
            } else {
                System.out.println("The equation has no solution");
            }
        }
    }
}
