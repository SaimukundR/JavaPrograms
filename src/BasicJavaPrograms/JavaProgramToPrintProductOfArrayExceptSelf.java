package BasicJavaPrograms;

import java.util.Scanner;

public class JavaProgramToPrintProductOfArrayExceptSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n=sc.nextInt();

        int[] a= new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }

        int[] c = productExceptSelf(n,a);

        System.out.print("The product array except self is: ");
        for(int r : c)
            System.out.print(r +" ");

    }
    public static int[] productExceptSelf(int a,int[] b){
        int[] leftProducts =  new int[a];
        int[] rightProducts= new int[a];
        int[] result = new int[a];

        leftProducts[0]=1;
        rightProducts[a-1]=1;

        for(int j=1;j<a;j++){
            leftProducts[j]= b[j-1] * leftProducts[j-1];
        }

        for(int k=a-2;k>=0;k--){
            rightProducts[k]= b[k+1] * rightProducts[k+1];
        }

        for(int z=0; z<a;z++){
            result[z]= rightProducts[z] * leftProducts[z];
        }
        return result;
    }
}
