package pers.zbb.test;

/**
 * Created by Administrator on 2016/6/21.
 */
public class MyGenericMax {
    public static <T extends Comparable<T>> T maxtest(T[] inputArray){
        T resMax = inputArray[0];
        for (T element: inputArray){
            if(element.compareTo(resMax) > 0){
                resMax = element;
            }
        }
        return resMax;
    }

    public static void main(String[] args){
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
        System.out.println("Integer compare result: " + maxtest(intArray));
        System.out.println("Double compare result: " + maxtest(doubleArray));
        System.out.println("Character compare result: " + maxtest(charArray));
    }
}
