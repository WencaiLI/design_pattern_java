package b_design_pattern.a_create.a_singleton_design_pattern.example_3;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 双重检测
 * </br>
 * 饿汉式不支持延迟加载，懒汉式有性能问题，不支持高并发。
 * 那我们再来看一种既支持延迟加载、又支持高并发的单例实现方式，也就是双重检测实现方式。
 * 在这种实现方式中，只要 instance 被创建之后，即便再调用 getInstance() 函数也不会再进入到加锁逻辑中了。
 * 所以，这种实现方式解决了懒汉式并发度低的问题。
 * @author liwencai
 * @since 2023/5/18
 */
public class IdGenerator {
    private final AtomicLong id = new AtomicLong(0);
    public static volatile IdGenerator idGenerator; // volatile很关键
    // CPU 指令重排序可能导致在 IdGenerator 类的对象被关键字 new 创建并赋值给 instance 之后，还没来得及初始化（执行构造函数中的代码逻辑），就被另一个线程使用了。
    // 这样，另一个线程就使用了一个没有完整初始化的 IdGenerator 类的对象。要解决这个问题，我们只需要给 instance 成员变量添加 volatile 关键字来禁止指令重排序即可。

    public IdGenerator getInstance() {
        if(null == idGenerator){
            synchronized (IdGenerator.class){
                if(null == idGenerator){
                    return new IdGenerator();
                }
            }
        }
        return idGenerator;
    }

    public long getId(){
        return id.incrementAndGet();
    }
}
