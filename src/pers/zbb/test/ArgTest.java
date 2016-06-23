package pers.zbb.test;

/**
 * Created by Administrator on 2016/6/23.
 */
public class ArgTest {
    public static void testRef(ClassArg classArg) {
        System.out.println("first classArg address is " + classArg.hashCode());
        classArg = new ClassArg(0);
        System.out.println("second classArg address is " + classArg.hashCode());
        int a = classArg.getA();
        System.out.println("first a in fun testRef is " + a);
        classArg.setA(20);
        a = classArg.getA();
        System.out.println("second a in fun testRef is " + a);
    }

    public static void testBase(int b){
        System.out.println("first b in fun testBase is " + b);
        b = 200;
        System.out.println("second b in fun testBase is " + b);
    }

    public static void main(String[] args){
        int a = 10;
        ClassArg classArg = new ClassArg(a);
        System.out.println("main first classArg address is " + classArg.hashCode());
        testRef(classArg);
        System.out.println("main second classArg address is " + classArg.hashCode());
        a = classArg.getA();
        System.out.println("a in fun main is " + a);

        int b = 100;
        testBase(b);
        System.out.println("b in fun main is " + b);

    }
}

class ClassArg {
    private int a;

    public ClassArg(int a){
        this.a = a;
    }

    public void setA(int a){
        this.a = a;
        System.out.println("a in class ClassArg is " + this.a);
    }

    public int getA(){
        return this.a;
    }
}
