package b_design_pattern.c_behavior.g_visitor_design_pattern.example_2;

import b_design_pattern.c_behavior.g_visitor_design_pattern.example_2.PPTFile;
import b_design_pattern.c_behavior.g_visitor_design_pattern.example_2.PdfFile;
import b_design_pattern.c_behavior.g_visitor_design_pattern.example_2.WordFile;

/**
 * @author liwencai
 * @since 2023/7/10
 */ //...PPTFile、WordFile代码省略...
public class Extractor {
    public void extract2txt(PPTFile pptFile) {
        //...
        System.out.println("Extract PPT.");
    }

    public void extract2txt(PdfFile pdfFile) {
        //...
        System.out.println("Extract PDF.");
    }

    public void extract2txt(WordFile wordFile) {
        //...
        System.out.println("Extract WORD.");
    }
}
