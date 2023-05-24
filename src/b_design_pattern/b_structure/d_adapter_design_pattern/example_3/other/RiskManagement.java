package b_design_pattern.b_structure.d_adapter_design_pattern.example_3.other;

import b_design_pattern.b_structure.d_adapter_design_pattern.example_3.other.ASensitiveWordsFilter;
import b_design_pattern.b_structure.d_adapter_design_pattern.example_3.other.BSensitiveWordsFilter;
import b_design_pattern.b_structure.d_adapter_design_pattern.example_3.other.CSensitiveWordsFilter;

/**
 * @author liwencai
 * @since 2023/5/24
 */
// 未使用适配器模式之前的代码：代码的可测试性、扩展性不好
public class RiskManagement {
    private ASensitiveWordsFilter aFilter = new ASensitiveWordsFilter();
    private BSensitiveWordsFilter bFilter = new BSensitiveWordsFilter();
    private CSensitiveWordsFilter cFilter = new CSensitiveWordsFilter();

    public String filterSensitiveWords(String text) {
        String maskedText = aFilter.filterSexyWords(text);
        maskedText = aFilter.filterPoliticalWords(maskedText);
        maskedText = bFilter.filter(maskedText);
        maskedText = cFilter.filter(maskedText, "***");
        return maskedText;
    }
}
