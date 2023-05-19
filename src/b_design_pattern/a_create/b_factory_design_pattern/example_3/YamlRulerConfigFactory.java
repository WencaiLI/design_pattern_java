package b_design_pattern.a_create.b_factory_design_pattern.example_3;

import b_design_pattern.a_create.b_factory_design_pattern.IRuleConfigParser;
import b_design_pattern.a_create.b_factory_design_pattern.YamlRuleConfigParser;

/**
 * @author liwencai
 * @since 2023/5/19
 */
public class YamlRulerConfigFactory extends IRuleConfigFactory {

    @Override
    public IRuleConfigParser create() {
        return new YamlRuleConfigParser();
    }
}
