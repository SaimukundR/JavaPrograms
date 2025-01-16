package BasicJavaPrograms;

import java.util.Scanner;

public class JavaProgramToFindMaxConsecutiveSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in the array: ");
        int n=sc.nextInt();

        int[] arr= new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int v= findMaxConsecutiveSeries(arr,n);
        System.out.println("Max Consecutive Series of value is: "+v);
    }
    public static int findMaxConsecutiveSeries(int[] a,int b){
        int count=0;
        int maximum=0;
        for(int i=0;i<a.length-1;i++){
            //checking if the current value +1 is equal to next value
            if(a[i]+1==a[i+1]){
                //if yes, its consecutive and count is increased by 1
                count++;
            }
            else
            //if no, its not consecutive and count value is set to 0
            {count=0;}

            //using the Math operator to check the max count among the count values which will be stored in the maximum variable
            maximum = Math.max(maximum,count+1);
        }
        return maximum;
    }
}
