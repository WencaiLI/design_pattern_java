package b_design_pattern.a_create.a_singleton_design_pattern.example_4;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 静态内部类
 * </br>
 * 我们再来看一种比双重检测更加简单的实现方法，那就是利用 Java 的静态内部类。它有点类似饿汉式，但又能做到了延迟加载。
 * SingletonHolder 是一个静态内部类，当外部类 IdGenerator 被加载的时候，并不会创建 SingletonHolder 实例对象。
 * 只有当调用 getInstance() 方法时，SingletonHolder 才会被加载，这个时候才会创建 instance。
 * instance 的唯一性、创建过程的线程安全性，都由 JVM 来保证。所以，这种实现方法既保证了线程安全，又能做到延迟加载。
 * @author liwencai
 * @since 2023/5/18
 */
public class IdGenerator {

    private final AtomicLong id = new AtomicLong(0);
    private IdGenerator() { // 1.构造方法私有
    }

    private static class singletonHolder{
       public static final IdGenerator INSTANCE = new IdGenerator(); // 2.
    }

    public IdGenerator getInstance() {
        return singletonHolder.INSTANCE;
    }

    public long getId(){
        return id.incrementAndGet();
    }

}
