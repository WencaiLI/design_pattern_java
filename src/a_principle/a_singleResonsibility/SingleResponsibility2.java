package a_principle.a_singleResonsibility;

public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("汽车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
        SeaVehicle seaVehicle = new SeaVehicle();
        seaVehicle.run("轮船");
    }
}
// 缺点：将类分解，改动较大，且改动main方法数据
// 方案直接修改Vehicle类，改动代码较少
class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+" 在地上跑");
    }
}
class AirVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+" 在天上飞");
    }
}
class SeaVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+" 在海里航行");
    }
}