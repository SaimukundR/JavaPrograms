package BasicJavaPrograms;

import java.util.Scanner;

public class JavaProgramToFindSumOfDigitsInANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long num= sc.nextLong();

        System.out.println(sumOfNumbers(num));

        sc.close();
    }

    public static long sumOfNumbers(long n){
        //assigning value to n to a temp variable for calculation
        long actualN=n;
        long sum=0;
        //using a loop iterating through each digit in the given number
        while(actualN!=0){
            // extracting the value of last digit from the number
            int digit= (int)(actualN % 10);
            //adding the value of the digits
            sum+=digit;
            // removing the last digit from the number
            actualN=actualN/10;
        }
        return sum;
    }
}
