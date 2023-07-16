package b_design_pattern.c_behavior.j_interpreter_design_pattern.excample_1;

/**
 * @author liwencai
 * @since 2023/7/16
 */
public class NumberExpression implements Expression {
    private long number;

    public NumberExpression(long number) {
        this.number = number;
    }

    public NumberExpression(String number) {
        this.number = Long.parseLong(number);
    }

    @Override
    public long interpret() {
        return this.number;
    }
}
