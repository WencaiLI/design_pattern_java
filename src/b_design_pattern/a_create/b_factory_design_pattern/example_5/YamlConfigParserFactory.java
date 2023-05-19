package b_design_pattern.a_create.b_factory_design_pattern.example_5;

import b_design_pattern.a_create.b_factory_design_pattern.IRuleConfigParser;
import b_design_pattern.a_create.b_factory_design_pattern.ISystemConfigParser;
import b_design_pattern.a_create.b_factory_design_pattern.YamlRuleConfigParser;
import b_design_pattern.a_create.b_factory_design_pattern.YamlSystemConfigParser;

/**
 * @author liwencai
 * @since 2023/5/19
 */
public class YamlConfigParserFactory implements IConfigParserFactory{
    @Override
    public IRuleConfigParser createRuleParser() {
        return new YamlRuleConfigParser();
    }

    @Override
    public ISystemConfigParser createSystemParser() {
        return new YamlSystemConfigParser();
    }
}
