package BasicJavaPrograms;

import java.util.Scanner;

public class JavaProgramToPrintArrayInReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n=sc.nextInt();

        String[] string= new String[n];
        //to consume the value from the previous input we need to add nextLine here to balance it, if are to use it next
        sc.nextLine();
        System.out.print("Enter the elements in the array: ");
        for(int i=0;i<n;i++){
            string[i]=sc.nextLine();
        }
        arrayReverse(string,n);
        sc.close();
    }
    public static void arrayReverse(String[] a,int num){
        System.out.print("The array elements in reverse are: ");
        for(int i=num-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
    }
}
