package b_design_pattern.c_behavior.f_iterator_design_pattern;

/**
 * @author liwencai
 * @since 2023/6/29
 */
public class ArrayList<E> implements List<E> {
    //...
    public Iterator<E> iterator() {
        return new ArrayIterator<>(this);
    }
    public void add(E element){
        // ...
    }

    E get(int elementSet){
        // ...
        throw new IllegalMonitorStateException();
    }

    public int size() {
        // ...
        return 0;
    }
    //...省略其他代码
}
