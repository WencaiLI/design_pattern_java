package b_design_pattern.c_behavior.d_chain_of_responsibility_design_pattern.example_1;

/**
 * @author liwencai
 * @since 2023/6/24
 */
public class test {
    public static void main(String[] args) {
        HandlerChain handlerChain = new HandlerChain();
        handlerChain.addHandler(new HandlerA());
        handlerChain.addHandler(new HandlerB());
        handlerChain.handle();
    }
}
