package BasicJavaPrograms;

import java.util.Scanner;

public class JavaProgramToCountNoOfCapLetters {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
 System.out.print("Enter string: ");
    String n=sc.nextLine();
    int v =arrayReverse(n);
   System.out.println(v);
}
    public static int arrayReverse(String a){
        int count=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)>='A' && a.charAt(i)<='Z'){
                count++;
            }
        }
        return count;
    }
}
