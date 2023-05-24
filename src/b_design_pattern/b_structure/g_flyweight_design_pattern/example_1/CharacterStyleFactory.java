package b_design_pattern.b_structure.g_flyweight_design_pattern.example_1;

import java.util.ArrayList;
import java.util.List;

/**
 * 享元模式重点是可共享的单元的数量是可数的
 * <br>
 * 单例模式与享元模式
 * 在单例模式中，一个类只能创建一个对象，而在享元模式中，一个类可以创建多个对象，每个对象被多处代码引用共享。
 * 实际上，享元模式有点类似于之前讲到的单例的变体：多例。
 * <br>
 * 缓存与享元模式
 * 缓存空间换时间，通过冗余数据减少耗时操作；
 * 享元模式是为了节省空间，在多个地方复用重复又不会修改的对象。
 * <br>
 * 池化技术与享元模式
 * 池化技术中的“复用”可以理解为“重复使用”，主要目的是节省时间（比如从数据库池中取一个连接，不需要重新创建）。
 * 在任意时刻，每一个对象、连接、线程，并不会被多处使用，而是被一个使用者独占，当使用完成之后，放回到池中，再由其他使用者重复利用。
 * 享元模式中的“复用”可以理解为“共享使用”，在整个生命周期中，都是被所有使用者共享的，主要目的是节省空间。
 * <br>
 * 我们可以用简单几句话来概括一下它们之间的区别。
 * 应用单例模式是为了保证对象全局唯一。
 * 应用享元模式是为了实现对象复用，节省内存。缓存是为了提高访问效率，而非复用。
 * 池化技术中的“复用”理解为“重复使用”，主要是为了节省时间。
 * @author liwencai
 * @since 2023/5/24
 */
public class CharacterStyleFactory {
    private static final List<CharacterStyle> styles = new ArrayList<>();

    public static CharacterStyle getStyle(Font font, int size, int colorRGB) {
        CharacterStyle newStyle = new CharacterStyle(font, size, colorRGB);
        for (CharacterStyle style : styles) {
            if (style.equals(newStyle)) {
                return style;
            }
        }
        styles.add(newStyle);
        return newStyle;
    }
}
