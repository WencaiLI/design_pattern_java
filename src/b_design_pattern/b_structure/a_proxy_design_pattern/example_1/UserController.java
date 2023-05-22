package b_design_pattern.b_structure.a_proxy_design_pattern.example_1;

import b_design_pattern.b_structure.a_proxy_design_pattern.UserVo;

/**
 * @author liwencai
 * @since 2023/5/22
 */
public class UserController implements IUserController{
    @Override
    public UserVo login(String telephone, String password) {
        // 处理逻辑
        // 返回UserVo对象
        return null;
    }

    @Override
    public UserVo register(String telephone, String password) {
        // 处理逻辑
        // 返回UserVo对象
        return null;
    }
}
