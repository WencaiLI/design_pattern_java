package b_design_pattern.b_structure.d_adapter_design_pattern.example_2;

import b_design_pattern.b_structure.d_adapter_design_pattern.Adaptee;
import b_design_pattern.b_structure.d_adapter_design_pattern.ITarget;

/**
 * 基于组合的方式
 * <br>
 * 1. 封装有缺陷的接口设计
 * 针对这两种实现方式，在实际的开发中，到底该如何选择使用哪一种呢？
 * 判断的标准主要有两个，一个是 Adaptee 接口的个数，另一个是 Adaptee 和 ITarget 的契合程度。
 * @author liwencai
 * @since 2023/5/23
 */
public class Adapter implements ITarget {
    Adaptee adaptee;

    Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void f1() {
        adaptee.fa();
    }

    @Override
    public void f2() {
        // ...
    }

    @Override
    public void f3() {
        // ...
    }
}
