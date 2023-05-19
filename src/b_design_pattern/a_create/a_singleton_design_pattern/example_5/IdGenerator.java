package b_design_pattern.a_create.a_singleton_design_pattern.example_5;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 枚举类
 * </br>
 * 最简单的实现方式，基于枚举类型的单例实现。这种实现方式通过 Java 枚举类型本身的特性，保证了实例创建的线程安全性和实例的唯一性。
 * @author liwencai
 * @since 2023/5/18
 */
public enum IdGenerator {

    INSTANCE;
    private final AtomicLong id = new AtomicLong(0);

    public long getId(){
        return id.incrementAndGet();
    }
}
