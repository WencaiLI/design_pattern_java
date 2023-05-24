package b_design_pattern.b_structure.d_adapter_design_pattern.example_3.better;

import b_design_pattern.b_structure.d_adapter_design_pattern.example_3.other.ASensitiveWordsFilter;

/**
 * @author liwencai
 * @since 2023/5/24
 */
public class ASensitiveWordsFilterAdaptor implements ISensitiveWordsFilter {
    private ASensitiveWordsFilter aFilter;

    public String filter(String text) {
        String maskedText = aFilter.filterSexyWords(text);
        maskedText = aFilter.filterPoliticalWords(maskedText);
        return maskedText;
    }
}
