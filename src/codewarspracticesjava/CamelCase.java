package codewarspracticesjava;

/**
 *
 * @author Manuel Espinosa Torres
 * 
 * '''Codewars exercise: "CamelCase Method"'''
 * 
 * '''Description:'''
 * Write simple .camelCase method (camel_case function in PHP, CamelCase in C# 
 * or camelCase in Java) for strings. All words must have their first letter 
 * capitalized without spaces.
 * 
 * '''Examples:'''
 * camelCase("hello case"); // => "HelloCase"
 * camelCase("camel case word"); // => "CamelCaseWord"
 * 
 */
public class CamelCase {
    public static void main(String[] args){
        String chain = "camel case word";
        System.out.println("The result of converting the string '" + chain + "' to the 'camelCase' format is: " + camelCase(chain) + ".");
    }
    
    public static String camelCase(String str) {
        String result = "";
        String[] words = str.trim().split(" ");

        for (String word : words) {
            if(word.length() > 0){
                result += Character.toUpperCase(word.charAt(0)) + word.substring(1);
            }
        }
        
        return result;
    }
}