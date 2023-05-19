package b_design_pattern.a_create.b_factory_design_pattern.example_1;

import b_design_pattern.a_create.b_factory_design_pattern.JsonRuleConfigParser;
import b_design_pattern.a_create.b_factory_design_pattern.IRuleConfigParser;
import b_design_pattern.a_create.b_factory_design_pattern.XmlRuleConfigParser;
import b_design_pattern.a_create.b_factory_design_pattern.YamlRuleConfigParser;

/**
 * 简单工厂方法
 * 通过简单判断方式实现
 * @author liwencai
 * @since 2023/5/19
 */
public class RuleConfigFactory {
    public static IRuleConfigParser createParser(String fileSuffix){
        if("json".equals(fileSuffix)){
            return new JsonRuleConfigParser();
        }
        if("yaml".equals(fileSuffix)){
            return new YamlRuleConfigParser();
        }
        if("xml".equals(fileSuffix)){
            return new XmlRuleConfigParser();
        }

        return null;
    }
}
