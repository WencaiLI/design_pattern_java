package b_design_pattern.b_structure.c_decorator_pattern.example_1;


import b_design_pattern.b_structure.c_decorator_pattern.BufferedInputStream;
import b_design_pattern.b_structure.c_decorator_pattern.DataInputStream;

import java.io.FileNotFoundException;

/**
 * 在Java的IO类中可见装饰器模式的典型应用
 * <br>
 * 第一个比较特殊的地方是：装饰器类和原始类继承同样的父类，这样我们可以对原始类“嵌套”多个装饰器类。
 * 第二个比较特殊的地方是：装饰器类是对功能的增强，这也是装饰器模式应用场景的一个重要特点。
 * 就拿比较相似的代理模式和装饰器模式来说，代理模式中，代理类附加的是跟原始类无关的功能，而在装饰器模式中，装饰器类附加的是跟原始类相关的增强功能。
 * </br>
 * 以下是一个例子
 * 通过装饰器模式使FileInputStream既支持缓存读取，又支持按照基本数据类型来读取数据。
 * <br>
 * 因抽象类强制直接继承的子类重新方法，所以加一层隔离即再用一个有默认方法的一般类作为增强功能子类的父类。
 * 代理模式是一个类对另一个类增加功能(增加说明业务独立)，桥接模式是一组类对另一组类组合功能，装饰器模式是一个类对另一个类增强功能(增强说明业务相关)。
 * 相同处:三者都是组合。 不同处: 代理模式、装饰器模式都实现了同一个接口或继承同一个抽象类。桥接模式是在独立维度上各自扩展再组合。
 * 装饰器模式是增强功能即在一个维度上增强更相关的特性，而桥接模式是组合功能即在多个维度上各自发展后各自组合。
 * @author liwencai
 * @since 2023/5/23
 */
public class Test {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("/xx/xx");
            BufferedInputStream bis = new BufferedInputStream(fileInputStream);
            DataInputStream din = new DataInputStream(bis);
            int data = din.readInt();
            // todo
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
