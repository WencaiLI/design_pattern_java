package b_design_pattern.c_behavior.g_visitor_design_pattern.example_3;



public abstract class ResourceFile {
  protected String filePath;
  public ResourceFile(String filePath) {
    this.filePath = filePath;
  }
  abstract public void accept(Extractor extractor);
  abstract public void accept(Compressor compressor);
}
//...PPTFile、WordFile跟PdfFile类似，这里就省略了...
//...Extractor代码不变

