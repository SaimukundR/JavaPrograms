package BasicJavaPrograms;

import java.util.Scanner;
import java.util.Stack;

public class JavaProgramToReverseUsingStack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Reversed value: "+stackReverse(n));

    }
    public static int stackReverse(int n){
        int reversedNum=0;
        int placeValue=1;
        Stack<Integer> stack = new Stack<>();
        while (n != 0) {
            stack.push(n % 10);
            n /= 10;
        }
        while (!stack.isEmpty()) {
            reversedNum+=stack.pop()*placeValue;
            placeValue*=10;
        }
        return reversedNum;

    }
}
