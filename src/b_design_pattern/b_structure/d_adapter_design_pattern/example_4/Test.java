package b_design_pattern.b_structure.d_adapter_design_pattern.example_4;

/**
 * 3. 替换依赖的外部系统
 * @author liwencai
 * @since 2023/5/24
 */
public class Test {

    Demo d = new Demo(new A());

    // 将外部系统A替换成外部系统B


    // 借助BAdaptor，Demo的代码中，调用IA接口的地方都无需改动，
// 只需要将BAdaptor如下注入到Demo即可。
    Demo d2 = new Demo(new BAdaptor(new B()));
}
