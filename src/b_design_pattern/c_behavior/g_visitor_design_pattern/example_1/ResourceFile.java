package b_design_pattern.c_behavior.g_visitor_design_pattern.example_1;

public abstract class ResourceFile {
  protected String filePath;

  public ResourceFile(String filePath) {
    this.filePath = filePath;
  }

  public abstract void extract2txt();
}

