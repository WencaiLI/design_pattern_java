package b_design_pattern.c_behavior.g_visitor_design_pattern.example_5;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liwencai
 * @since 2023/7/10
 */
public class ExtractorFactory {
    private static final Map<ResourceFileType, Extractor> extractors = new HashMap<>();

    static {
        extractors.put(ResourceFileType.PDF, new PdfExtractor());
        extractors.put(ResourceFileType.PPT, new PdfExtractor());
        extractors.put(ResourceFileType.WORD, new WordExtractor());
    }

    public static Extractor getExtractor(ResourceFileType type) {
        return extractors.get(type);
    }
}
