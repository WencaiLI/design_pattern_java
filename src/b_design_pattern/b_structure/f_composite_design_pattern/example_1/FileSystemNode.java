package b_design_pattern.b_structure.f_composite_design_pattern.example_1;

import java.io.File;
import java.util.List;

/**
 * 组合模式
 * <br>
 * 将一组对象组织（Compose）成树形结构，以表示一种“部分 - 整体”的层次结构。
 * 组合让客户端（在很多设计模式书籍中，“客户端”代指代码的使用者。）可以统一单个对象和组合对象的处理逻辑。
 * @author liwencai
 * @since 2023/5/24
 */
public class FileSystemNode {
    private String path;

    private Boolean isFile;
    private List<FileSystemNode> subNodes;


    public FileSystemNode(String path,  Boolean isFile, List<FileSystemNode> subNodes) {
        this.path = path;
        this.isFile = isFile;
        this.subNodes = subNodes;
    }

    public int countNumOfFiles() {
        if (isFile) {
            return 1;
        }
        int numOfFiles = 0;

        for (FileSystemNode fileOrDir : subNodes) {
            numOfFiles += fileOrDir.countNumOfFiles();
        }
        return numOfFiles;
    }

    public long countSizeOfFiles() {
        if (isFile) {
            File file = new File(path);
            if (!file.exists()) return 0;
            return file.length();
        }
        long sizeofFiles = 0;
        for (FileSystemNode fileOrDir : subNodes) {
            sizeofFiles += fileOrDir.countSizeOfFiles();
        }
        return sizeofFiles;
    }

    public String getPath() {
        return path;
    }

    boolean addFilePath(FileSystemNode file) {
        subNodes.add(file);
        return true;
    }

    boolean removeFilePath(FileSystemNode node) {
        subNodes.removeIf(fileSystemNode -> fileSystemNode.getPath().equalsIgnoreCase(node.getPath()));
        return true;

    }

}
