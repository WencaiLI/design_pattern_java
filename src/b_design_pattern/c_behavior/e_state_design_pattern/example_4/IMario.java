package b_design_pattern.c_behavior.e_state_design_pattern.example_4;

import b_design_pattern.c_behavior.e_state_design_pattern.State;
import b_design_pattern.c_behavior.e_state_design_pattern.example_3.SuperMario;

public interface IMario {
  State getName();
  void obtainMushRoom(MarioStateMachine stateMachine);
  void obtainCape(MarioStateMachine stateMachine);
  void obtainFireFlower(MarioStateMachine stateMachine);
  void meetMonster(MarioStateMachine stateMachine);
}

// 省略SuperMario、CapeMario、FireMario类...

