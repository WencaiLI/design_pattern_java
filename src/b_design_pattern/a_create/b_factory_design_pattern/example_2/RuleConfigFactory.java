package b_design_pattern.a_create.b_factory_design_pattern.example_2;

import b_design_pattern.a_create.b_factory_design_pattern.JsonRuleConfigParser;
import b_design_pattern.a_create.b_factory_design_pattern.IRuleConfigParser;
import b_design_pattern.a_create.b_factory_design_pattern.XmlRuleConfigParser;
import b_design_pattern.a_create.b_factory_design_pattern.YamlRuleConfigParser;

import java.util.HashMap;
import java.util.Map;

/**
 * 简单工厂方法
 * </br>
 * 缓存常用的对象，Integer的.valueOf()方法
 * @author liwencai
 * @since 2023/5/19
 */
public class RuleConfigFactory {
    private static final Map<String, IRuleConfigParser> cacheParsers = new HashMap<>(3);

    static{
        cacheParsers.put("xml",new XmlRuleConfigParser());
        cacheParsers.put("json",new JsonRuleConfigParser());
        cacheParsers.put("yaml",new YamlRuleConfigParser());
    }

    IRuleConfigParser createParser(String fileSuffix){
        if(null == fileSuffix){
            return null; // TODO: 2023/5/19 自定义处理方式
        }
        return cacheParsers.get(fileSuffix);
    }
}
