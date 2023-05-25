package b_design_pattern.c_behavior.b_template_design_pattern.example_2;

/**
 * @author liwencai
 * @since 2023/5/25
 */
public class AClass {
    public static void main(String[] args) {
        BClass bClass = new BClass();
        bClass.process(new ICallback() {
            @Override
            public void method() {
                // todo
                System.out.println("xxxx");
            }
        });

        CClass cClass = new CClass();
        cClass.process(()-> System.out.println("todo something"));
    }
}
