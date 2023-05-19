package b_design_pattern.a_create.a_singleton_design_pattern.example_2;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 懒汉式
 * </br>
 * 需要时再加载，（懒加载）
 * @author liwencai
 * @since 2023/5/18
 */
public class IdGenerator {
    private final AtomicLong id = new AtomicLong(0);

    public static IdGenerator idGenerator;

    public static synchronized IdGenerator getInstance() { // synchronized关键字是为了在并发情况下，防止在创建时被被同时执行此方法。
        if(null == idGenerator){
            return new IdGenerator();
        }
        return idGenerator;
    }

    public long getId(){
        return id.incrementAndGet();
    }
}
