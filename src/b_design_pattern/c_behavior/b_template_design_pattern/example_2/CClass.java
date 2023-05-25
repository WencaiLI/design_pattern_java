package b_design_pattern.c_behavior.b_template_design_pattern.example_2;

/**
 * @author liwencai
 * @since 2023/5/25
 */
public class CClass {
    void process(ICallback1 callback){
        callback.method();
    }
}
