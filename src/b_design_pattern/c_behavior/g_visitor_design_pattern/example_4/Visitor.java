package b_design_pattern.c_behavior.g_visitor_design_pattern.example_4;

/**
 * @author liwencai
 * @since 2023/7/10
 */
public interface Visitor {
    void visit(PdfFile pdfFile);

    void visit(PPTFile pdfFile);

    void visit(WordFile pdfFile);
}
