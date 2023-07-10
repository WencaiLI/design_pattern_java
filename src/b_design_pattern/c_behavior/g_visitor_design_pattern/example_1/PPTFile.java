package b_design_pattern.c_behavior.g_visitor_design_pattern.example_1;

/**
 * @author liwencai
 * @since 2023/7/10
 */
public class PPTFile extends ResourceFile {
    public PPTFile(String filePath) {
        super(filePath);
    }

    @Override
    public void extract2txt() {
        //...省略一大坨从PPT中抽取文本的代码...
        //...将抽取出来的文本保存在跟filePath同名的.txt文件中...
        System.out.println("Extract PPT.");
    }
}
