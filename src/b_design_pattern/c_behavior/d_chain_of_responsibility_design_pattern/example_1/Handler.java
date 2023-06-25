package b_design_pattern.c_behavior.d_chain_of_responsibility_design_pattern.example_1;

/**
 * @author liwencai
 * @since 2023/6/24
 */
public abstract class Handler {
    public Handler successor = null;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
    public abstract void handle();
}
