package pers.zbb.iterator;
import java.util.Vector;

/**
 * Created by Administrator on 2016/6/22.
 */
public class ConcreteIterator implements Iterator {
    private int currentIndex = 0;
    private Vector vector = null;

    public ConcreteIterator(final Vector vector){
        this.vector = vector;
    }

    public Object first(){
        currentIndex = 0;
        return vector.get(currentIndex);
    }

    public Object next(){
        currentIndex ++;
        return vector.get(currentIndex);
    }

    public Object currentItem(){
        return vector.get(currentIndex);
    }

    public boolean isDone(){
        if(currentIndex >= this.vector.size() - 1){
            return true;
        }else {
            return false;
        }
    }
}
