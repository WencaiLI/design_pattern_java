package b_design_pattern.b_structure.f_composite_design_pattern.example_2;

import java.util.List;

/**
 * @author liwencai
 * @since 2023/5/24
 */
public class File extends FileSystemNode{

    private List<File> subFiles;

    public File(String path) {
        super(path);
    }

    @Override
    public int countNumOfFiles() {
        return 1;
    }

    @Override
    public long countSizeOfFiles() {
        java.io.File file = new java.io.File(this.getPath());
        if (!file.exists()) return 0;
        return file.length();
    }

}
