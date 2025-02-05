package BasicJavaPrograms;

import java.util.Scanner;

public class JavaProgramToCheckMaxConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int  n= sc.nextInt();

        int[] num = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            num[i]= sc.nextInt();
        }

        System.out.print("Max consecutive 1s are: "+findConsecutiveOnes(num));
    }

    public static int findConsecutiveOnes(int[] n){

        int count=0, max=0;

        for(int k : n){
            if(k==1){
                count++;
                max = Math.max(max,count);
            } else count=0;
        }

        return max;

    }
}
