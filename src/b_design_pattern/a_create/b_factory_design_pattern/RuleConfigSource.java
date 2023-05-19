package b_design_pattern.a_create.b_factory_design_pattern;

import b_design_pattern.a_create.b_factory_design_pattern.example_1.RuleConfigFactory;

/**
 * @author liwencai
 * @since 2023/5/19
 */
public class RuleConfigSource {
    public RulerConfig load(String filePath){
        String fileSuffix = getFileSuffix(filePath);
        IRuleConfigParser parser = RuleConfigFactory.createParser(fileSuffix);
        String configTest = "";
        if(null == parser){
            return null; // todo 根据自定义方式选择抛出异常还是不做处理
        }
        return parser.parser(configTest);
    }

    private String getFileSuffix(String filePath){
        return "json";
    }
}
