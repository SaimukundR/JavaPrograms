package BasicJavaPrograms;

import java.util.HashMap;
import java.util.Scanner;

public class JavaProgramToFindFirstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input= sc.nextLine();
        if(input == null || input.isEmpty()){
            System.out.print("The first non repeasting character is '_' as the string is null/empty");
        }else{

            System.out.print("The first non repeasting character is: "+firstNonRepeatChar(input));
        }
    }

    public static char firstNonRepeatChar(String s){

        HashMap<Character,Integer> char_count= new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char c= s.charAt(i);
            if(char_count.containsKey(c)){
                char_count.put(c,char_count.get(c)+1);
            }
            else{
                char_count.put(c,1);
            }
        }

        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(char_count.get(c)==1)
                return c;
        }
        return '_';
    }
}
