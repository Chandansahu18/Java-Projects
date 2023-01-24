import java.util.*;

public class stringBuilderclassInJava {

    public static void main(String[] args) {
        
        //Practice 01
        //This will print string using StringBuilder class.
        // StringBuilder string = new StringBuilder("Chandan Sahu");
        // System.out.println(string);

        //Practice 02
        //This will print character at a particular index.
        // StringBuilder string = new StringBuilder("Chandan Sahu");
        // System.out.println(string.charAt(0));
        
        //Practice 03
        //This will replace a character with another character in the String and print it.
        // StringBuilder string = new StringBuilder("Chandan Sahu");
        // string.setCharAt(2, 'e');
        // System.out.println(string);

        //Practice 04
        //This will insert a new Character in the string and print it
        // StringBuilder string  = new StringBuilder("Tony");
        // string.insert(2,'n');
        // System.out.println(string);

        //Practice 05
        //This will delete a particular part of a string from given String and print the string.
        // StringBuilder string = new StringBuilder("Elon");
        // string.delete(0,2);
        // string.insert(0,'T');
        // string.insert(3,'y');
        // System.out.println(string);
        
        //Practice 06
        //This will append new characters in the string and print the updated string.
        // StringBuilder string = new StringBuilder("h");
        // string.append('e');
        // string.append('l');
        // string.append('l');
        // string.append('o');
        // System.out.println(string); 
//StringBuilder class appends new Characters in the same string object instead of creating a new string object which ultimately boost performance of the code to run efficiently.
        
       //Practice 07
       //This will print length of given string of StringBuilder class.   
    //    StringBuilder string = new StringBuilder("Chandan Sahu");
    //    System.out.println(string.length());

      //Practice 08
      //This will print the inverse of string.
    //   StringBuilder string = new StringBuilder("Chandan");
    //   System.out.println(string);
    //   for(int i=string.length()-1;i>=0;i--){
        //    System.out.print(string.charAt(i)); 
        //   }
           
        //Another method to do inverse of a string.
        //    StringBuilder string = new StringBuilder("Chandan");
        //    string.reverse();
        //    System.out.println(string);
        
    }

}
