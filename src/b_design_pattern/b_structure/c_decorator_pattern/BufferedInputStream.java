package b_design_pattern.b_structure.c_decorator_pattern;

/**
 * @author liwencai
 * @since 2023/5/23
 */
public class BufferedInputStream extends InputStream {
    protected volatile InputStream in;

    public BufferedInputStream(InputStream in) {
        this.in = in;
    }

    //...实现基于缓存的读数据接口...
}
