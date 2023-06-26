package b_design_pattern.c_behavior.e_state_design_pattern.example_3;

import b_design_pattern.c_behavior.e_state_design_pattern.State;

public interface IMario { //所有状态类的接口
  State getName();
  //以下是定义的事件
  void obtainMushRoom();
  void obtainCape();
  void obtainFireFlower();
  void meetMonster();
}
