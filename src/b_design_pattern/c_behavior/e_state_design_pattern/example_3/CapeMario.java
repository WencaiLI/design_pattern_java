package b_design_pattern.c_behavior.e_state_design_pattern.example_3;

import b_design_pattern.c_behavior.e_state_design_pattern.State;

/**
 * @author liwencai
 * @since 2023/6/26
 */
public class CapeMario implements IMario {
    private MarioStateMachine stateMachine;

    public CapeMario(MarioStateMachine marioStateMachine) {
        this.stateMachine = marioStateMachine;
    }

    @Override
    public State getName() {
        // todo
        return null;
    }

    @Override
    public void obtainMushRoom() {
        // todo

    }

    @Override
    public void obtainCape() {
        // todo

    }

    @Override
    public void obtainFireFlower() {
        // todo

    }

    @Override
    public void meetMonster() {
        // todo

    }
}
