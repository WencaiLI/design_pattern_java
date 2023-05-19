package b_design_pattern.a_create.a_singleton_design_pattern.example_1;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 饿汉式
 * </br>
 * 饿汉式的实现方式比较简单。在类加载的时候，instance 静态实例就已经创建并初始化好了，所以，instance 实例的创建过程是线程安全的。
 * 不过，这样的实现方式不支持延迟加载（在真正用到 IdGenerator 的时候，再创建实例），从名字中我们也可以看出这一点。具体的代码实现如下所示：
 * @author liwencai
 * @since 2023/5/18
 */
public class IdGenerator {
    private final AtomicLong id = new AtomicLong(0);
    public static final IdGenerator INSTANCE = new IdGenerator();

    public IdGenerator getInstance() {
        return INSTANCE;
    }

    public long getId(){
        return id.incrementAndGet();
    }
}
