package b_design_pattern.c_behavior.d_chain_of_responsibility_design_pattern.example_3;

/**
 * @author liwencai
 * @since 2023/6/24
 */
public class HandlerA implements IHandler {
    @Override
    public boolean handle() {
        boolean handled = false;
        //...
        System.out.println("HandlerA ...");
        return handled;
    }
}
