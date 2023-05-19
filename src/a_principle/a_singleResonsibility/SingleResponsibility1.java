package a_principle.a_singleResonsibility;

public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }
}
// run方法违反单一职责原则
// 解决方案就是根据交通工具运行方式的不同，分解不同的类
class Vehicle{
    public void run(String type){
        System.out.println(type+" 在公路上跑");
    }
}