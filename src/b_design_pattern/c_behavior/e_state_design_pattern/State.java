package b_design_pattern.c_behavior.e_state_design_pattern;

/**
 * 状态机有 3 个组成部分：状态（State）、事件（Event）、动作（Action）。其中，事件也称为转移条件（Transition Condition）。
 * 事件触发状态的转移及动作的执行。不过，动作不是必须的，也可能只转移状态，不执行任何动作。
 * 状态模式常用于游戏和工作流引擎之中，以下例子以游戏超级马里奥为例
 * 像这种只对数据进行简单的操作的可是使用查表法解决，但是一旦涉及到复杂的行为，查表法就力不从心了
 *
 * @author liwencai
 * @since 2023/6/26
 */

public enum State {
    SMALL(0),
    SUPER(1),
    FIRE(2),
    CAPE(3);

    private int value;

    private State(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}

