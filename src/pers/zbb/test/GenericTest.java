package pers.zbb.test;

/**
 * Created by Administrator on 2016/6/24.
 */
public class GenericTest {
    public static void main(String[] args) {

        Box<Number> name = new Box<Number>(99);
        Box<Integer> age = new Box<Integer>(712);
        Box<String> addr = new Box<String>("china");

        getData(name);
        getData(age);
//        getData(addr);

    }

    public static void getData(Box<? extends Number> data){
        System.out.println("data :" + data.getData());
    }
}

class Box<T> {

    private T data;

    public Box() {

    }

    public Box(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

}