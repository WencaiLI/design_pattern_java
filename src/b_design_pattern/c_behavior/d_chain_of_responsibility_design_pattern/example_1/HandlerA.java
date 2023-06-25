package b_design_pattern.c_behavior.d_chain_of_responsibility_design_pattern.example_1;

/**
 * @author liwencai
 * @since 2023/6/24
 */
public class HandlerA extends Handler{
    @Override
    public void handle() {
        boolean handled = false;
        // todo
        System.out.println("HandlerA ....");
        if(null != successor){
            successor.handle();
        }
    }
}
