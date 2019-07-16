package hbcu.stay.ready.assessment1.part1;
import com.sun.tools.corba.se.idl.StringGen;
import hbcu.stay.ready.assessment1.part2.StringUtils;

import java.lang.String;
/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        return null;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder reverseString = new StringBuilder(str);
        return reverseString.reverse().toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, with each word individually in reverse order
     */
    public static String reverseWords(String str) {
        StringBuilder reverseStr = new StringBuilder(str);
        int ismystringworking = 0;
        //String [] strWords = str.split(" ");
        //for(word: strWords){}
        for (int i = reverseStr.charAt(0); i < str.length() - 1; i++) {
            reverseStr = reverseStr.reverse();
            ismystringworking++;

        }
        return reverseStr.toString() + ismystringworking;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        /* int i = 0;
        String word = str.toUpperCase().charAt(i);
        String newStr = new String();
        StringBuilder reverseIt = new StringBuilder(str)
        for (;str.length()-1; i >= 0; i--){
            newStr+=reverseIt.reverse(word);
        }
        return newStr; */
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        return null;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char[] charStr = new Character();
        for (int i = 0; i < charStr.length; i--) {
            if (Character.isLowerCase(charStr[i])) {
                charStr[i] = Character.toUpperCase(charStr[i]);
            }
            charStr[i] = Character.toLowerCase(charStr[i]);
        }
        return str;
    }
}
