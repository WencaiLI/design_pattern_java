package b_design_pattern.c_behavior.a_observer_design_pattern.example_2.better;

import b_design_pattern.c_behavior.a_observer_design_pattern.PromotionService;
import b_design_pattern.c_behavior.a_observer_design_pattern.UserService;

import java.util.ArrayList;
import java.util.List;

public class UserController {
  private UserService userService; // 依赖注入
  private PromotionService promotionService; // 依赖注入

  List<RegisterObserver> observerList = new ArrayList<>();

  void setRegObservers(List<RegisterObserver> registerObserver){
    observerList.addAll(registerObserver);
  }


  public Long register(String telephone, String password) {
    //省略输入参数的校验代码
    //省略userService.register()异常的try-catch代码
    long userId = userService.register(telephone, password);
    observerList.forEach(observer->{
      observer.handleSuccess(userId);
    });
    return userId;
  }
}