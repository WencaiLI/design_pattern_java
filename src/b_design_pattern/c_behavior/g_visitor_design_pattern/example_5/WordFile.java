package b_design_pattern.c_behavior.g_visitor_design_pattern.example_5;

/**
 * @author liwencai
 * @since 2023/7/10
 */
public class WordFile extends ResourceFile {
    public WordFile(String filePath) {
        super(filePath);
    }

    @Override
    public ResourceFileType getType() {
        return ResourceFileType.WORD;
    }

    //...
}
