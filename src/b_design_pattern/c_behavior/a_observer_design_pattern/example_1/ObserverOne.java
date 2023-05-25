package b_design_pattern.c_behavior.a_observer_design_pattern.example_1;

/**
 * @author liwencai
 * @since 2023/5/25
 */
public class ObserverOne extends Observer{

    @Override
    void update(String message) {
        System.out.println("observer one receive b_template_design_pattern message : "+message);
    }
}
