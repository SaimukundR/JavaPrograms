package BasicJavaPrograms;

import java.util.Scanner;

public class JavaProgramToSwapTwoStrings {

    public static void main(String[] args){
    //input values from the user
    Scanner sc = new Scanner(System.in);
       System.out.print("Enter the first string value: ");
    String input1= sc.nextLine();
       System.out.print("Enter the second string value: ");
    String input2= sc.nextLine();

    //usning a string array to hold the string values returned form the swap method
    String[] swappedString= swap(input1,input2);

    //printing the values on the console
       System.out.println("First String value: "+swappedString[0]);
       System.out.println("Second String value: "+swappedString[1]);

       sc.close();
}
    public static String[] swap(String a, String b){
        // swapping using a temp valriable
        // String temp="";

        // temp=a;
        // a=b;
        // b=temp;

        //swapping using the subString method in Strings
        // concatinating the values of a & b in putting them in a
        a= a+b;
        // length of the difference between a & b.
        //ie- b = value of index from(0, (length0f(a{a+b})-lengthOf(b))
        // so b will have the value from(0 to original length of a)
        b = a.substring(0, a.length() - b.length());
        // so a will have the value from length of b obtained from the previous step
        a = a.substring(b.length());

        return new String[] {a,b};
    }
}
