package b_design_pattern.c_behavior.e_state_design_pattern.example_2;

import b_design_pattern.c_behavior.e_state_design_pattern.State;

/**
 * 状态机还可以用二维表来表示，在这个二维表中，第一维表示当前状态，第二维表示事件，值表示当前状态经过事件之后，转移到的新状态及其执行的动作。
 * @author liwencai
 * @since 2023/6/26
 */
public class ApplicationDemo {
    public static void main(String[] args) {
        MarioStateMachine mario = new MarioStateMachine();
        mario.obtainMushRoom();
        int score = mario.getScore();
        State state = mario.getCurrentState();
        System.out.println("mario score: " + score + "; state: " + state);
    }
}
