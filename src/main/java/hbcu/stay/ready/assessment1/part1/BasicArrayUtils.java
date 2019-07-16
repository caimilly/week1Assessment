package hbcu.stay.ready.assessment1.part1;

import com.sun.deploy.util.StringUtils;
import com.sun.xml.internal.fastinfoset.util.StringArray;

/**
 * Created by leon on 2/16/18.
 */
public class BasicArrayUtils {
    /**
     * @param stringArray an array of String objects
     * @return the first element in the array
     */
    public static String getFirstElement(String[] stringArray) {
        return stringArray[0];
    }

    /**
     * @param stringArray an array of String objects
     * @return the second element in the array
     */
    public static String getSecondElement(String[] stringArray) { return stringArray[1];}

    /**
     * @param stringArray an array of String objects
     * @return stringArray with the elements in reverse order
     */
    public static String[] reverse(String[] stringArray) {
        /*String[] response = new String[stringArray.length];
        int y = 0;
        for (int x= stringArray.length-1; x >= 0; x--){
           response[y] = stringArray[x];
           y++;
        }
        return response; */
        return null;
    }

    /**
     * @param stringArray an array of String objects
     * @return String made up of the first character in each element of stringArray
     */
    public static String getFirstLetterOfEachElement(String[] stringArray) {
        int i=0;
        String response = new String();
        String stringSplit=stringArray.toString().substring(i);
        for(; i<stringArray.length-1;i++){
            response += stringSplit.charAt(i);
        }
        return response;
    }
}
