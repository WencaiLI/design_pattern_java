package b_design_pattern.b_structure.d_adapter_design_pattern.example_3.other;

public class ASensitiveWordsFilter { // A敏感词过滤系统提供的接口
  //text是原始文本，函数输出用***替换敏感词之后的文本
  public String filterSexyWords(String text) {
    // ...
    return null;
  }
  
  public String filterPoliticalWords(String text) {
    // ...
    return null;
  } 
}

//...省略BSensitiveWordsFilterAdaptor、CSensitiveWordsFilterAdaptor...

