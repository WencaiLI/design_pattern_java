package b_design_pattern.c_behavior.f_iterator_design_pattern;

public interface List<E> {
  Iterator iterator();

  void add(E element);
  //...省略其他接口函数...
}

