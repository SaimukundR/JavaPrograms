package BasicJavaPrograms;

import java.util.Scanner;

public class JavaProgramToReverseAString {

    public static void main(String[] args){


        //input values from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string value: ");
        String input= sc.nextLine();

        //using the method and providing the string as parameter
        String reversedValue= reverse(input);

        // printing the value of the string
        System.out.println("Reversed String: "+ reversedValue);

        sc.close();

    }
    public static String reverse(String input){
        // using for loop to iterate through the chars from last
           String output="";
           for(int i= input.length()-1; i>=0; i--){
               output= output+ input.charAt(i);
           }

        // using string builder to reverse the string
        //StringBuilder builder = new StringBuilder(input);

        return  output;
                //builder.reverse().toString();

    }
}
