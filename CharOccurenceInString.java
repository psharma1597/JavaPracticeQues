// Find the occurence of each character in string with hashmap
import java.util.*;

public class CharOccurenceInString {
    public static void main(String[] args){
        String str = "GeeksforGeeks";

        //creating hashmap containing character as key and occurrences as a value
        HashMap<Character,Integer> checkCount = new HashMap<Character, Integer>();

        //convert string to char Array
        char[] strArray = str.toCharArray();

        //check all the chars of strArray
        for(char c : strArray){
            if(checkCount.containsKey(c)){
                checkCount.put(c,checkCount.get(c)+1);   //if char is present in hashmap, increment it's value by 1
            }
            else{
                checkCount.put(c,1);  //if char is not present in hashmap, putting the current character in key with it's value as 1
            }
        }
        
        for(Map.Entry entry : checkCount.entrySet()){  //iterate over hashmap to print chars with occurrences
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }
    }
}
