package b_design_pattern.b_structure.f_composite_design_pattern.example_2;

/**
 * @author liwencai
 * @since 2023/5/24
 */
public abstract class FileSystemNode {
    private String path;

    public FileSystemNode(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public abstract int countNumOfFiles();

    public abstract long countSizeOfFiles();
}
