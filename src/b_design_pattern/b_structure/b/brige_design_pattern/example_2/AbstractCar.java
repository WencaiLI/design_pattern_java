package b_design_pattern.b_structure.b.brige_design_pattern.example_2;

/**
 * 举个很简单的例子，现在有两个纬度
 * Car 车 （奔驰、宝马、奥迪等）
 * Transmission 档位类型 （自动挡、手动挡、手自一体等）
 * 按照继承的设计模式，Car是一个Abstract基类，假设有M个车品牌，N个档位一共要写M*N个类去描述所有车和档位的结合。
 * 而当我们使用桥接模式的话，我首先new一个具体的Car（如奔驰），再new一个具体的Transmission（比如自动档）。然后奔驰.set(手动档)就可以了。
 * 那么这种模式只有M+N个类就可以描述所有类型，这就是M*N的继承类爆炸简化成了M+N组合。
 * </br>
 * 所以桥接模式解决的应该是继承爆炸问题。
 * 可以看作是两个abstract组合在一起，独立去拓展，在运行之前将两个具体实现组合到一起。
 * 遵循以下原则
 * ·依赖倒置原则
 * ·迪米特法则
 * ·里氏替换原则
 * ·接口隔离原则
 * ·单一职责原则
 * ·开闭原则
 */
public abstract class AbstractCar {

  protected Transmission gear;
  
  public abstract void run();
  
  public void setTransmission(Transmission gear) {
    this.gear = gear;
  }
  
}