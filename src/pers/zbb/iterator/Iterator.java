package pers.zbb.iterator;

/**
 * Created by Administrator on 2016/6/22.
 */
public interface Iterator{
    public Object first();

    public Object next();

    public Object currentItem();

    public boolean isDone();
}
