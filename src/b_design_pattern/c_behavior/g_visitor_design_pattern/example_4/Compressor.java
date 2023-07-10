package b_design_pattern.c_behavior.g_visitor_design_pattern.example_4;

/**
 * @author liwencai
 * @since 2023/7/10
 */
public class Compressor implements Visitor {
    @Override
    public void visit(PPTFile pptFile) {
        //...
        System.out.println("Compress PPT.");
    }

    @Override
    public void visit(PdfFile pdfFile) {
        //...
        System.out.println("Compress PDF.");
    }

    @Override
    public void visit(WordFile wordFile) {
        //...
        System.out.println("Compress WORD.");
    }

}
