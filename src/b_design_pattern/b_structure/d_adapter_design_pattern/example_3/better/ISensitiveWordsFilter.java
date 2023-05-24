package b_design_pattern.b_structure.d_adapter_design_pattern.example_3.better;

/**
 * @author liwencai
 * @since 2023/5/24
 */ // 使用适配器模式进行改造
public interface ISensitiveWordsFilter { // 统一接口定义
    String filter(String text);
}
