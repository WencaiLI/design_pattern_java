package b_design_pattern.b_structure.a_proxy_design_pattern.example_1;

import b_design_pattern.b_structure.a_proxy_design_pattern.UserVo;

/**
 * @author liwencai
 * @since 2023/5/22
 */
public interface IUserController {
    UserVo login(String telephone, String password);
    UserVo register(String telephone, String password);
}
