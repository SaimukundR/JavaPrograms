package BasicJavaPrograms;

import java.util.Scanner;

public class JavaProgramToCheckIfNumberIsArmstrong {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num= sc.nextLong();

        checkArmStrong(num);
        sc.close();
    }
    public static void checkArmStrong(long n){
        //assigning value to n to a temp variable for calculation
        long actualN=n;
        long sum=0;
        //using a loop iterating through each digit in the given number
        while(actualN!=0){
            // extracting the value of last digit from the number
            int digit= (int)(actualN % 10);
            //cubing the digit and assigning the value to sum, subsequently adding the value of other digits
            sum+=(digit*digit*digit);
            //dividing the number by 10 to remove the last digit
            actualN=actualN/10;

        }
        if(sum==n){
            System.out.println("Its a Armstrong number as "+n+" equal to "+sum);
        }
        else{System.out.println("Its not a Armstrong number as "+n+" not equal to "+sum);
        }
    }
}
