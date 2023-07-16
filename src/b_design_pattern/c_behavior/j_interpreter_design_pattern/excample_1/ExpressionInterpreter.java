package b_design_pattern.c_behavior.j_interpreter_design_pattern.excample_1;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author liwencai
 * @since 2023/7/16
 */
public class ExpressionInterpreter {
    private Deque<Expression> numbers = new LinkedList<>();

    public long interpret(String expression) {
        String[] elements = expression.split(" ");
        int length = elements.length;
        for (int i = 0; i < (length + 1) / 2; ++i) {
            numbers.addLast(new NumberExpression(elements[i]));
        }

        for (int i = (length + 1) / 2; i < length; ++i) {
            String operator = elements[i];
            boolean isValid = "+".equals(operator) || "-".equals(operator)
                    || "*".equals(operator) || "/".equals(operator);
            if (!isValid) {
                throw new RuntimeException("Expression is invalid: " + expression);
            }

            Expression exp1 = numbers.pollFirst();
            Expression exp2 = numbers.pollFirst();
            Expression combinedExp = null;
            if (operator.equals("+")) {
                combinedExp = new AdditionExpression(exp1, exp2);
            } else if (operator.equals("-")) {
                combinedExp = new AdditionExpression(exp1, exp2); // todo 替换不同的实现
            } else if (operator.equals("*")) {
                combinedExp = new AdditionExpression(exp1, exp2); // todo 替换不同的实现
            } else if (operator.equals("/")) {
                combinedExp = new AdditionExpression(exp1, exp2); // todo 替换不同的实现
            }
            long result = combinedExp.interpret();
            numbers.addFirst(new NumberExpression(result));
        }

        if (numbers.size() != 1) {
            throw new RuntimeException("Expression is invalid: " + expression);
        }

        return numbers.pop().interpret();
    }
}
