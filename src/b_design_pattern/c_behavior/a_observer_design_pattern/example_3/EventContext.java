package b_design_pattern.c_behavior.a_observer_design_pattern.example_3;

import java.lang.reflect.Method;

public interface EventContext {
    String getSource();

    Object getSubscriber();

    Method getSubscribe();

    Object getEvent();
}