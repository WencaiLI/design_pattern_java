package b_design_pattern.c_behavior.j_interpreter_design_pattern.excample_1;

import java.util.Deque;
import java.util.LinkedList;

public interface Expression {
  long interpret();
}

// SubstractionExpression/MultiplicationExpression/DivisionExpression与AdditionExpression代码结构类似，这里就省略了

