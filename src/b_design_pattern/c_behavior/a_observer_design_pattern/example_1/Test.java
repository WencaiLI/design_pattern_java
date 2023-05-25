package b_design_pattern.c_behavior.a_observer_design_pattern.example_1;

/**
 * 观察者模式也称发布订阅模式
 *
 * @author liwencai
 * @since 2023/5/25
 */
public class Test {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        ObserverOne observerOne = new ObserverOne();
        ObserverTwo observerTwo = new ObserverTwo();
        concreteSubject.registerObserver(observerOne);
        concreteSubject.registerObserver(observerTwo);
        concreteSubject.notifyObservers("hello!");
    }
}
