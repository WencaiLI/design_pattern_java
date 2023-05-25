package b_design_pattern.c_behavior.b_template_design_pattern.example_1;

/**
 * 模板方法模式在一个方法中定义一个算法骨架，并将某些步骤推迟到子类中实现。
 * 模板方法模式可以让子类在不改变算法整体结构的情况下，重新定义算法中的某些步骤。这里的“算法”，我们可以理解为广义上的“业务逻辑”，并不特指数据结构和算法中的“算法”。
 * 这里的算法骨架就是“模板”，包含算法骨架的方法就是“模板方法”，这也是模板方法模式名字的由来。在模板模式经典的实现中，模板方法定义为 final，可以避免被子类重写。
 * 需要子类重写的方法定义为 abstract，可以强迫子类去实现。
 * 不过，在实际项目开发中，模板模式的实现比较灵活，以上两点都不是必须的。模板模式有两大作用：复用和扩展。
 * 其中，复用指的是，所有的子类可以复用父类中提供的模板方法的代码。扩展指的是，框架通过模板模式提供功能扩展点，让框架用户可以在不修改框架源码的情况下，基于扩展点定制化框架的功能。
 */
public abstract class AbstractClass {
  public final void templateMethod() {
    //...
    method1();
    //...
    method2();
    //...
  }
  
  protected abstract void method1();
  protected abstract void method2();
}