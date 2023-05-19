package a_principle.a_singleResonsibility;

public class SingleResponsibility4 {
    public static void main(String[] args) {
        Vehicle3 vehicle3 = new Vehicle3();
        vehicle3.run("飞机","天上");
        vehicle3.run("汽车","路上");
        vehicle3.run("轮船","轮船");
    }
}
// 适用于语义变化小的操作（2022.5.6）
class Vehicle3{
    public void run(String vehicle,String wey){
        System.out.println(vehicle+" 在 "+wey+" 运行");
    }

}