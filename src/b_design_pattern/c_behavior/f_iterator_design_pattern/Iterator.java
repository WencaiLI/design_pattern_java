package b_design_pattern.c_behavior.f_iterator_design_pattern;

/**
 * @author liwencai
 * @since 2023/6/29
 */
public interface Iterator<T> {
    boolean hasNext();
    void next();
    T currentElement();
}
