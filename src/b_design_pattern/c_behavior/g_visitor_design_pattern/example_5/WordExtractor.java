package b_design_pattern.c_behavior.g_visitor_design_pattern.example_5;

/**
 * @author liwencai
 * @since 2023/7/10
 */
public class WordExtractor implements Extractor {
    @Override
    public void extract2txt(ResourceFile resourceFile) {
        System.out.println("word extractor");
        //...
    }
}
