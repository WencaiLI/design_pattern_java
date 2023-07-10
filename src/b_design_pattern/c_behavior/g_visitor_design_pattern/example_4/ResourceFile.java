package b_design_pattern.c_behavior.g_visitor_design_pattern.example_4;

public abstract class ResourceFile {
  protected String filePath;
  public ResourceFile(String filePath) {
    this.filePath = filePath;
  }
  abstract public void accept(Visitor vistor);
}

//...PPTFile、WordFile跟PdfFile类似，这里就省略了...

