package b_design_pattern.c_behavior.j_interpreter_design_pattern.excample_2;

import java.util.Map;

public interface Expression {
  boolean interpret(Map<String, Long> stats);
}

// LessExpression/EqualExpression跟GreaterExpression代码类似，这里就省略了

