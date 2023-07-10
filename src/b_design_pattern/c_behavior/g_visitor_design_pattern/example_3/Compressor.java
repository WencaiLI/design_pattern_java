package b_design_pattern.c_behavior.g_visitor_design_pattern.example_3;

/**
 * @author liwencai
 * @since 2023/7/10
 */
public class Compressor {
    public void compress(PdfFile pdfFile) {
        System.out.println("pdf file compressor");
    }
    public void compress(WordFile pdfFile) {
        System.out.println("word file compressor");
    }
    public void compress(PPTFile pdfFile) {
        System.out.println("ppt file compressor");
    }
}
