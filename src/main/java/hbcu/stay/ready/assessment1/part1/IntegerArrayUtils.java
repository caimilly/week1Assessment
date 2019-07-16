package hbcu.stay.ready.assessment1.part1;

import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        int sum=0;
        int i;
        for(i=0;i<=intArray.length;i++){
            sum +=i;
        }
        return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        /*int product=0;
        for(int i=intArray[0];i<=intArray.length;i++){
            int product *= intArray[i];
        }
        return product; */
        return null;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        int sum=0;
        int average=0;
        for(int i=0;i<=intArray.length;i++){
            sum +=i;
        }
        average+=sum/intArray.length;
        return (double)average;
    }

    /**
     * @param intArray an array of integers
     * @return the largest integer in intArray
     */
    public static Integer getLargest(Integer[] intArray) {
        /*int placeHolder = 0;
        for(int i=0;i<= intArray.length-1;i++){
            for(int m=0;m<= intArray.length-1;m++){
                if (intArray[i] > m){
                    placeHolder += intArray[i];
                    intArray[i] = m;
                    m = placeHolder;
                }
            }
        }
        return IntegerArrayUtils.getLargest(intArray); */
        Arrays.sort(intArray);
        return intArray[intArray.length-1];
    }
}
