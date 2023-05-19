package b_design_pattern.a_create.b_factory_design_pattern.example_4;

import b_design_pattern.a_create.b_factory_design_pattern.example_3.IRuleConfigFactory;
import b_design_pattern.a_create.b_factory_design_pattern.example_3.JsonRuleConfigFactory;
import b_design_pattern.a_create.b_factory_design_pattern.example_3.XmlRuleConfigFactory;
import b_design_pattern.a_create.b_factory_design_pattern.example_3.YamlRulerConfigFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * 与example_3相比
 * 当我们需要添加新的规则配置解析器的时候，我们只需要创建新的 parser 类和 parser factory 类，
 * 并且在 RuleConfigParserFactoryMap 类中，将新的 parser factory 对象添加到 cachedFactories 中即可。
 * 代码的改动非常少，基本上符合开闭原则。
 * @author liwencai
 * @since 2023/5/19
 */
public class RuleConfigParserFactoryMap {
    private static final Map<String, IRuleConfigFactory> cacheFactoryMap = new HashMap<>(3);

    static {
        cacheFactoryMap.put("json", new JsonRuleConfigFactory());
        cacheFactoryMap.put("xml", new XmlRuleConfigFactory());
        cacheFactoryMap.put("yaml", new YamlRulerConfigFactory());
    }

    public static IRuleConfigFactory getParserFactory(String fileSuffix) {
        if(null == fileSuffix){
            return null; // TODO: 2023/5/19 自行处理
        }
        return cacheFactoryMap.get(fileSuffix);
    }

}
