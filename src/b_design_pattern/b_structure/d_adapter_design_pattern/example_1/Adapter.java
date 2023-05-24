package b_design_pattern.b_structure.d_adapter_design_pattern.example_1;

import b_design_pattern.b_structure.d_adapter_design_pattern.Adaptee;
import b_design_pattern.b_structure.d_adapter_design_pattern.ITarget;

/**
 * 基于继承的适配器模式
 * <br>
 * 1. 封装有缺陷的接口设计
 * @author liwencai
 * @since 2023/5/23
 */
public class Adapter extends Adaptee implements ITarget {

    @Override
    public void f1() {
        super.fa(); //委托给Adaptee
    }

    @Override
    public void f2() {
        // ...重新实现
    }

    @Override
    public void f3() {
        // ...重新实现
    }
}
