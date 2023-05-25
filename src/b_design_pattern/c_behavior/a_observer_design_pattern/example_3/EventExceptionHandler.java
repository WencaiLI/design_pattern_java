package b_design_pattern.c_behavior.a_observer_design_pattern.example_3;



public interface EventExceptionHandler {
    void handle(Throwable cause, EventContext context);
}