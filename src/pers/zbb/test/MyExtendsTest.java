package pers.zbb.test;

/**
 * Created by Administrator on 2016/6/21.
 */
public class MyExtendsTest extends MyExtends {
    public int a = 2;

    public char c = 'a';
    public int getint(){
        return this.a;
    }

    public char getchar(){
        return this.c;
    }

    public static void main(String[] args){
        MyExtendsTest test = new MyExtendsTest();
        System.out.println("get int: " + test.getint());
        System.out.println("get char: " + test.getchar());
    }
}

class MyExtends {
    public int a = 1;

    public int getint(){
        return this.a;
    }
}