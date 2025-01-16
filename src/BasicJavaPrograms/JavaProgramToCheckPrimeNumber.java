package BasicJavaPrograms;

import java.util.Scanner;

public class JavaProgramToCheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num= sc.nextLong();


        if(checkPrimeNumber(num)){
            System.out.print(num+" is prime");
        }else System.out.print(num+" is not prime");

        sc.close();
    }

    public static boolean checkPrimeNumber(long n){
        //checking if the number is greater than 1
        if(n<=1){
            return false;

        }
        //using a loop iterating and checking if the number is divisible by any number from 2
        for(int i=2;i<n;i++){
            if (n % i == 0) {
                return false;
            }
        }


        return true;
    }
}
