package pers.zbb.iterator;

/**
 * Created by Administrator on 2016/6/22.
 */
public class Client {
    public static void main(final String[] args) {
        // 具体容器角色实例
        final Aggregat agg = new ConcreteAggregat();

        // 迭代器实例（由容器角色实例创建）
        final Iterator iterator = agg.createIterator();

        // 使用迭代器
        System.out.println(iterator.first());
        while (!iterator.isDone()){
            System.out.println(iterator.next());
        }
    }
}
