package pers.zbb.test;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by Administrator on 2016/6/23.
 */
public class EnumerationTest {
    public static void main(String[] args){
        Enumeration days;
        Vector dayNames = new Vector();
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");
        dayNames.add("Sunday");
        days = dayNames.elements();
        while (days.hasMoreElements()){
            System.out.println(days.nextElement());
        }
    }
}
