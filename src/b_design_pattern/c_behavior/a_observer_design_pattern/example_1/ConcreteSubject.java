package b_design_pattern.c_behavior.a_observer_design_pattern.example_1;

import java.util.LinkedList;

/**
 * @author liwencai
 * @since 2023/5/25
 */
public class ConcreteSubject implements Subject{

    LinkedList<Observer> observers = new LinkedList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        observers.forEach(observer->observer.update(message));
    }
}
