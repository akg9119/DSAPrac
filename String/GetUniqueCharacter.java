package String;

import java.util.LinkedHashMap;
import java.util.Map;

public class GetUniqueCharacter {
   /**
    * The function `firstUniqueCharacter` takes a string as input and returns the index of the first
    * non-repeating character in the string, or -1 if all characters are repeated.
    * 
    * @param s The given code snippet defines a method `firstUniqueCharacter` that takes a string `s`
    * as input and returns the index of the first unique character in the string. If there are no
    * unique characters in the string, it returns -1.
    * @return The method `firstUniqueCharacter` returns the index of the first unique character in the
    * input string `s`. If there are no unique characters in the string, it returns -1.
    */
    public static int  firstUniqueCharacter(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char i : s.toCharArray()) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        String s = "abdnsabsd";
        int index = firstUniqueCharacter(s);
        if (index != -1) {  
            System.out.println("First unique character is at index: " + index);
        } else {
            System.out.println("No unique character found.");
        }   
    }
}
