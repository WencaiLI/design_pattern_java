package b_design_pattern.b_structure.c_decorator_pattern.example_2;

import b_design_pattern.b_structure.c_decorator_pattern.InputStream;

import java.io.IOException;

/**
 *
 * FilterInputStream引入的原因：
 * 对与装饰器类要引入FilterInputStream个中间层的原因，因为它使得装饰器类能够将增强的多次增强的类增强点保留下来，如果只装饰器类和非装饰器类继承一个抽象类，
 * 这样会造成增强点的消失
 * 但是这样必须要求：
 * InputStream可能被扩展的的方法都要出现在FilterInputStream中
 * 并且需要执行传入的被装饰的类中的方法`inputStream.read(bytes);`
 * @author liwencai
 * @since 2023/5/23
 */
public class FilterInputStream extends InputStream {

    InputStream inputStream;

    public FilterInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }


    public int read(byte[] bytes) throws IOException {
        return inputStream.read(bytes);
    }
}
