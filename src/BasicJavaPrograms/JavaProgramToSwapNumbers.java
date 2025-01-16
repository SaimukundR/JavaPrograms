package BasicJavaPrograms;

import java.util.Scanner;

public class JavaProgramToSwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter second number: ");
        int num2=sc.nextInt();

        int[] swapped=swapNumbers(num1,num2);
        System.out.println("First: "+swapped[0]);
        System.out.println("Second: "+swapped[1]);
    }
    public static int[] swapNumbers(int a, int b){
        a=a^b;
        b=a^b;
        a=a^b;
        int[] values={a,b};

        return values;
    }
}
