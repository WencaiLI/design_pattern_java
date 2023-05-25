package b_design_pattern.c_behavior.a_observer_design_pattern.example_1;

/**
 * @author liwencai
 * @since 2023/5/25
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String message);
}
