package BasicJavaPrograms;

import java.util.Scanner;

public class JavaProgramToPrintFibonacciSeries {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number where series needs to end: ");
        int num= sc.nextInt();

        //System.out.println();
        fabonacciSeries(num);

        sc.close();
    }
    public static void fabonacciSeries(int n){
//initially the values of first and second would be 0 & 1
        int first=0;
        int second=1;
// considering another variable to add the values
        int next =0;
        // loop to iterate through the numbers
        for(int i=1; i<=n; i++){
            // to print the value of the first after each iteration
            System.out.print(first+" ");
            // next would contain sum of previous 2 numbers
            next=first+second;
            // value of second would become the first
            first=second;
            // value of the next(sum of previous numbers) would  become the second
            second=next;
        }
        //return result;
    }
}
