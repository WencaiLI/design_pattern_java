package b_design_pattern.c_behavior.f_iterator_design_pattern;

/**
 * 遍历集合一般有三种方式：for 循环、foreach 循环、
 * 迭代器遍历。后两种本质上属于一种，都可以看作迭代器遍历。相对于 for 循环遍历，利用迭代器来遍历有下面三个优势：迭代器模式封装集合内部的复杂数据结构，
 * 开发者不需要了解如何遍历，直接使用容器提供的迭代器即可；迭代器模式将集合对象的遍历操作从集合类中拆分出来，放到迭代器类中，
 * 让两者的职责更加单一；迭代器模式让添加新的遍历算法更加容易，更符合开闭原则。
 * 除此之外，因为迭代器都实现自相同的接口，在开发中，基于接口而非实现编程，替换迭代器也变得更加容易。
 *　（重要）对于迭代器如何在集合在更新之后被正确地遍历，我们可以有两种方案，第一种是数据在遍历时不允许更新　第二种更好实现　就是通过维护一个更新次数的值，
 * 　通过在遍历同事比对当前的值与迭代器初始化的值对比，就可判断集合是否被更新，从而报错。更新次数的值可以看作是某集合实例的一种版本号，版本号不同，表示集合被更新。
 *
 * @author liwencai
 * @since 2023/6/29
 */
public class ArrayIterator<T> implements Iterator<T> {

    /**
     * 游标
     */
    int cursor;

    ArrayList<T> arrayList;

    public ArrayIterator(ArrayList<T> arrayList) {
        this.cursor = 0;
        this.arrayList = arrayList;
    }

    @Override
    public boolean hasNext() {
        return cursor != arrayList.size();
    }

    @Override
    public void next() {
        cursor ++;
    }

    @Override
    public T currentElement() {
        if(cursor >= arrayList.size()){
           // todo throw new NoSuchElementException();
        }
        return arrayList.get(cursor);
    }
}
