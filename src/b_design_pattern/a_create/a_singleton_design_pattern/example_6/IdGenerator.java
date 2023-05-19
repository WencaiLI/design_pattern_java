package b_design_pattern.a_create.a_singleton_design_pattern.example_6;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 对双重检测的优化
 * </br>
 * 静态变量有了 volatile 关键字，需要从主存同步，修改又要同步到主存，消耗了io，
 * 而局部变量和主存无关，只要最后一次同步到主存上去就好
 * @author liwencai
 * @since 2023/5/18
 */
public class IdGenerator {
    public volatile static IdGenerator idGenerator;

    private final AtomicLong id = new AtomicLong(0);

    public IdGenerator getInstance() {
        IdGenerator temp = idGenerator;
        if(null == temp){
            synchronized (IdGenerator.class){
                temp = idGenerator;
                if(temp == idGenerator){
                    temp = new IdGenerator();
                    return temp;
                }

            }
        }
        return idGenerator;
    }



    public long getId(){
        return id.incrementAndGet();
    }

}
