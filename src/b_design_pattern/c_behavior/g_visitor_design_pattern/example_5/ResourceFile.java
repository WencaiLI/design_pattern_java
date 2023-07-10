package b_design_pattern.c_behavior.g_visitor_design_pattern.example_5;

import java.util.HashMap;

public abstract class ResourceFile {
  protected String filePath;
  public ResourceFile(String filePath) {
    this.filePath = filePath;
  }
  public abstract ResourceFileType getType();
}

//...PPTFile/WordFile跟PdfFile代码结构类似，此处省略...

//...PPTExtractor/WordExtractor跟PdfExtractor代码结构类似，此处省略...

