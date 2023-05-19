package a_principle.b_segregation.improve;


public class Segregation2 {
    public static void main(String[] args) {
        // 使用
        A a = new A();
        B b = new B();
        a.depend1(b); // 这个理解为A通过接口去依赖Ｂ
        a.depend2(b);
        a.depend3(b);
        C c = new C();
        D d = new D();
        c.depend1(d); // 同理C通过接口去依赖D
        c.depend4(d);
        c.depend5(d);
    }
}
interface Interface_1{
    void operation1();
}
interface Interface_2_3{
    void operation2();
    void operation3();
}
interface Interface_4_5{
    void operation4();
    void operation5();
}
class B implements Interface_1,Interface_2_3 {

    public void operation1() {
        System.out.println("B 实现了 operation1");
    }

    public void operation2() {
        System.out.println("B 实现了 operation2");
    }

    public void operation3() {
        System.out.println("B 实现了 operation3");
    }
}

class D implements Interface_1,Interface_4_5{

    public void operation1() {
        System.out.println("D 实现了 operation1");
    }
    public void operation4() {
        System.out.println("D 实现了 operation4");
    }

    public void operation5() {
        System.out.println("D 实现了 operation5");
    }
}
// A类通过接口依赖B类，但只会使用1，2，3方法
class A {
    public void depend1(Interface_1 interface1){
        interface1.operation1();
    }
    public void depend2(Interface_2_3 interface1){
        interface1.operation2();
    }
    public void depend3(Interface_2_3 interface1){
        interface1.operation2();
    }
}
// C类通过接口依赖D类，但只会使用1，4，5方法
class C {
    public void depend1(Interface_1 interface1){
        interface1.operation1();
    }
    public void depend4(Interface_4_5 interface1){
        interface1.operation4();
    }
    public void depend5(Interface_4_5 interface1){
        interface1.operation5();
    }
}