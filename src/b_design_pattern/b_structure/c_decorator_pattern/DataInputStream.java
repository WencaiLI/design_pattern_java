package b_design_pattern.b_structure.c_decorator_pattern;

/**
 * @author liwencai
 * @since 2023/5/23
 */
public class DataInputStream extends InputStream {
    protected volatile InputStream in;

    public DataInputStream(InputStream in) {
        this.in = in;
    }

    public int readInt() {
        return 0;
    }

    //...实现读取基本类型数据的接口
}
