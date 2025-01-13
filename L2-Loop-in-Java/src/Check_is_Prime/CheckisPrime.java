package Check_is_Prime;

import java.util.Scanner;

public class CheckisPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if(num < 2){
            System.out.println(num + " is not a prime number");
        }else{
            boolean isPrime = true;
            for(int i = 2; i <= Math.sqrt(num); i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(num + " is a prime ");
            }else{
                System.out.println(num + " is not a prime ");
            }
        }
    }
}
