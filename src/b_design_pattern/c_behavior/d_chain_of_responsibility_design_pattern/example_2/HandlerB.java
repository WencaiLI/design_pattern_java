package b_design_pattern.c_behavior.d_chain_of_responsibility_design_pattern.example_2;

/**
 * @author liwencai
 * @since 2023/6/24
 */
public class HandlerB extends Handler {
    @Override
    protected boolean doHandle() {
        boolean handled = false;
        //...
        System.out.println("HandlerB ...");
        return handled;
    }
}
