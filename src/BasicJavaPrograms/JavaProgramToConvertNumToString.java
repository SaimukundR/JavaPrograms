package BasicJavaPrograms;

import java.util.Scanner;

public class JavaProgramToConvertNumToString {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 System.out.print("Enter the string: ");
    String n=sc.nextLine();

    convertNumToString(n);

}
    public static void convertNumToString(String b){
        for(int i=0;i<b.length();i++){
            if(Character.isAlphabetic(b.charAt(i))){
                System.out.print(b.charAt(i));
            }
            else
            {
                int a= Character.getNumericValue(b.charAt(i));
                for(int j=1;j<a;j++){
                    System.out.print(b.charAt(i-1));
                }

            }
        }
    }
}
