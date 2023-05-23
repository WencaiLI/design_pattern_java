package b_design_pattern.b_structure.c_decorator_pattern.example_1;

import b_design_pattern.b_structure.c_decorator_pattern.InputStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;

/**
 * @author liwencai
 * @since 2023/5/23
 */
public class FileInputStream extends InputStream {

    public FileInputStream(String name) throws FileNotFoundException {
        this(name != null ? new File(name) : null);
    }

    public FileInputStream(File file){

    }
    // methods
}
