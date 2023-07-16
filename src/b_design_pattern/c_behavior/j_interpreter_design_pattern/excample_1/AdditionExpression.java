package b_design_pattern.c_behavior.j_interpreter_design_pattern.excample_1;

/**
 * @author liwencai
 * @since 2023/7/16
 */
public class AdditionExpression implements Expression {
    private Expression exp1;
    private Expression exp2;

    public AdditionExpression(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public long interpret() {
        return exp1.interpret() + exp2.interpret();
    }
}
