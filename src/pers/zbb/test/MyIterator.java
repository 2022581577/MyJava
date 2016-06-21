package pers.zbb.test;

import java.util.ArrayList;
import java.util.Iterator;
/**
 * Created by Administrator on 2016/6/21.
 */
public class MyIterator {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("TEST1");
        list.add("TEST2");
        list.add("TEST3");
        list.add("TEST4");
        list.add("TEST6");
        list.add("TEST5");
        Iterator<String> it = list.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}

