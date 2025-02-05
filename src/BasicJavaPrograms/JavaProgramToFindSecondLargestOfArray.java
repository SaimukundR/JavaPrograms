package BasicJavaPrograms;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class JavaProgramToFindSecondLargestOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of digits in the array: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.print("Enter the numbers of the array: ");
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        findSecondLargestNumber(a);
    }
    public static void findSecondLargestNumber(int[] b){
        int temp=0;

        for(int i=0;i<b.length;i++){
            for(int j=i+1;j<b.length;j++){
                if(b[i]>b[j]){
                    temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }
        for(int i= b.length-2;i>=0;i--){
            if(b[i] != b[b.length-1]){
              System.out.print("Second largest number is: "+ b[i]);
              return;
            }
        }
        System.out.print("The numbers are the same, hence no second largest to find");
    }
}
