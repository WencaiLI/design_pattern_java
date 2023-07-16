package b_design_pattern.c_behavior.j_interpreter_design_pattern.excample_2;

import java.util.Map;

/**
 * @author liwencai
 * @since 2023/7/16
 */
public class AlertRuleInterpreter {
    private Expression expression;

    public AlertRuleInterpreter(String ruleExpression) {
        this.expression = new OrExpression(ruleExpression);
    }

    public boolean interpret(Map<String, Long> stats) {
        return expression.interpret(stats);
    }
}
