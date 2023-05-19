package a_principle.d_liskovSubstitution;

public class Liskov1 {
    public static void main(String[] args) {

        A a = new A();
        System.out.println("11-3="+a.func1(11,3));
        System.out.println("1-8="+a.func1(1,8));
        B b = new B();
        System.out.println("11-3="+b.func1(11,3));
        // B无意中重写了A中的func1方法
        System.out.println("1-8="+b.func1(1,8));
        System.out.println("11+3+9="+b.func2(11,3));
    }
}

class A {
    public int func1(int numb_1,int numb_2){
        return numb_1 - numb_2;
    }
}
class B extends A{
    public int func1(int a,int b){
        return a+b;
    }
    public int func2(int a,int b){
        return func1(a, b)+9;
    }
}

//解决方法.
//1)我们发现原来运行正常的相减功能发生了错误。原因就是类B无意中重写了父类的
//方法，造成原有功能出现错误。在实际编程中，我们常常会通过重写父类的方法完
//成新的功能，这样写起来虽然简单，但整个继承体系的复用性会比较差。特别是运
//行多态比较频繁的时候
//2)通用的做法是:原来的父类和子类都继承-一个更通俗的基类，原有的继承关系去掉,
//采用依赖，聚合，组合等关系代替.