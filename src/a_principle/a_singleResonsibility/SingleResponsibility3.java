package a_principle.a_singleResonsibility;

public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle = new Vehicle2();
        vehicle.runAir("飞机");
        vehicle.runRoad("汽车");
        vehicle.runSea("轮船");
    }
}
// 只是增加方法，没有对类进行大的修改
// 在类上不符合符合单一职责，在方法层面符合单一职责原则
// 在方法比较臃肿时还是建议使用类分解的方式
// 思考：双参传递是否符合单一原则 如方案四
class Vehicle2{
    public void runRoad(String vehicle){
        System.out.println(vehicle+" 在路上运行");
    }
    public void runAir(String vehicle){
        System.out.println(vehicle+" 在空中运行");
    }
    public void runSea(String vehicle){
        System.out.println(vehicle+" 在水里运行");
    }
}