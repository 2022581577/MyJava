package pers.zbb.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by Administrator on 2016/6/23.
 */
public class SerializeTest {
    public static void main(String[] args){
        Employee e = new Employee();
        e.name = "zhongbinbin";
        e.address = "china";
        e.SSN = 11122333;
        e.number = 101;
        try{
            FileOutputStream fileOut = new FileOutputStream("../../../../employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in employee.ser");
        } catch(IOException i){
            i.printStackTrace();
        }
    }
}

class Employee implements java.io.Serializable {
    public String name;
    public String address;
    public transient int SSN;
    public int number;

    public void mailCheck() {
        System.out.println("Mailing a check to " + name + " " + address);
    }
}