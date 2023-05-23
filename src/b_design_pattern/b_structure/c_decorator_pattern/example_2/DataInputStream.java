package b_design_pattern.b_structure.c_decorator_pattern.example_2;

import b_design_pattern.b_structure.c_decorator_pattern.InputStream;

/**
 * @author liwencai
 * @since 2023/5/23
 */
public class DataInputStream extends FilterInputStream {
    protected volatile InputStream in;

    public DataInputStream(InputStream in) {
        this.in = in;
    }

    public int readInt() {
        return 0;
    }

    //...实现读取基本类型数据的接口
}
