package b_design_pattern.b_structure.a_proxy_design_pattern.example_2;

import b_design_pattern.b_structure.a_proxy_design_pattern.UserController;
import b_design_pattern.b_structure.a_proxy_design_pattern.example_1.IUserController;

/**
 * @author liwencai
 * @since 2023/5/22
 */
public class Test {
    public static void main(String[] args) {
        MetricsCollectorProxy proxy = new MetricsCollectorProxy();
        IUserController userController = (IUserController) proxy.createProxy(new UserController());
    }
}
