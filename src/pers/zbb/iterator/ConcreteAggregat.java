package pers.zbb.iterator;

import java.util.Vector;

/**
 * Created by Administrator on 2016/6/22.
 */
public class ConcreteAggregat implements Aggregat {
    private Vector vector = null;

    public Vector getVector(){
        return vector;
    }

    public void setVector(final Vector vector){
        this.vector = vector;
    }

    public ConcreteAggregat(){
        vector = new Vector();
        vector.add("vector 1");
        vector.add("vector 2");
        vector.add("vector 3");
    }

    public Iterator createIterator(){
        return new ConcreteIterator(vector);
    }
}
