package b_design_pattern.c_behavior.d_chain_of_responsibility_design_pattern.example_3;

/**
 * @author liwencai
 * @since 2023/6/24
 */ // 使用举例
public class Application {
    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.handle();
    }
}
