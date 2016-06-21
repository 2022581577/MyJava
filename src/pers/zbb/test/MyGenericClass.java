package pers.zbb.test;

/**
 * Created by Administrator on 2016/6/21.
 */
public class MyGenericClass<T> {

    private T t;

    public void add(T t){
        this.t = t;
    }

    public T get(){
        return this.t;
    }

    public static void main(String[] args){
        MyGenericClass<Integer> integerTest = new MyGenericClass<Integer>();
        Integer intAdd = 1;
        integerTest.add(intAdd);
        Integer intGet = integerTest.get();
        System.out.println("Integer class result: " + intGet);

        MyGenericClass<String> stringTest = new MyGenericClass<String>();
        String stringAdd = "钟斌斌";
        stringTest.add(stringAdd);
        String stringGet = stringTest.get();
        System.out.println("String class result: " + stringGet);
    }

}
