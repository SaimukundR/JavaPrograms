package BasicJavaPrograms;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class JavaProgramToFindDuplicateCharsOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String value= sc.nextLine();

        stringCount(value);

        sc.close();
    }

    public static void stringCount(String a){
        //using HashMap we can store the char and its int value
        HashMap<Character,Integer> hashMap= new HashMap<>();
// converting the string to charArray for iterating
        char[] strArray= a.toCharArray();

// using loop to iterate through the char array
        for(char c: strArray)
        {
            //checking if the hashMap contains the char, if yes incrementing its integer value by 1
            if(hashMap.containsKey(c)){
                hashMap.put(c,hashMap.get(c)+1);
                // hashMap1.put(c,hashMap1.get(c)+1);
            }
            // if no, assigning its integer value as 1
            else{
                hashMap.put(c,1);
            }
        }
// using Key Set method to get all the chars in a Set variable from the hashMap
        Set<Character> keys= hashMap.keySet();
//check which of the char has value more than 1
        for(char c:keys){
            if(hashMap.get(c)>1){
                System.out.println(c+" --> "+hashMap.get(c));
            }
        }
    }
}
