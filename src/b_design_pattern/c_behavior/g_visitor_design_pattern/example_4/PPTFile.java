package b_design_pattern.c_behavior.g_visitor_design_pattern.example_4;

/**
 * @author liwencai
 * @since 2023/7/10
 */
public class PPTFile extends ResourceFile {
    public PPTFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    //...
}
