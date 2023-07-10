package b_design_pattern.c_behavior.g_visitor_design_pattern.example_3;



/**
 * @author liwencai
 * @since 2023/7/10
 */
public class PdfFile extends ResourceFile {
    public PdfFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Extractor extractor) {
        extractor.extract2txt(this);
    }

    @Override
    public void accept(Compressor compressor) {
        compressor.compress(this);
    }

    //...
}
