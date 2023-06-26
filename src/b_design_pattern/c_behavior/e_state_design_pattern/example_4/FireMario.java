package b_design_pattern.c_behavior.e_state_design_pattern.example_4;

import b_design_pattern.c_behavior.e_state_design_pattern.State;

/**
 * @author liwencai
 * @since 2023/6/26
 */
public class FireMario implements IMario{

    private static final FireMario instance = new FireMario();

    private FireMario() {
    }

    public static FireMario getInstance() {
        return instance;
    }

    @Override
    public State getName() {
        return null;
    }

    @Override
    public void obtainMushRoom(MarioStateMachine stateMachine) {

    }

    @Override
    public void obtainCape(MarioStateMachine stateMachine) {

    }

    @Override
    public void obtainFireFlower(MarioStateMachine stateMachine) {

    }

    @Override
    public void meetMonster(MarioStateMachine stateMachine) {

    }
}
