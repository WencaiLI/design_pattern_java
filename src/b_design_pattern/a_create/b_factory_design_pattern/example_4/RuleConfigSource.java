package b_design_pattern.a_create.b_factory_design_pattern.example_4;

import b_design_pattern.a_create.b_factory_design_pattern.RulerConfig;
import b_design_pattern.a_create.b_factory_design_pattern.IRuleConfigParser;
import b_design_pattern.a_create.b_factory_design_pattern.example_3.IRuleConfigFactory;

/**
 * 对工厂类来说符合OCP原则，但是众多的工厂方法又都耦合进load方法中，效果不好，
 * 所以我们可以为工厂类再创建一个简单工厂，也就是工厂的工厂，用来创建工厂类对象见example_4
 *
 * @author liwencai
 * @since 2023/5/19
 */
public class RuleConfigSource {
    public RulerConfig load(String filePath){
        String fileSuffix = getFileSuffix(filePath);

        // FIXME: 2023/5/19 差异在这里
        IRuleConfigFactory ruleConfigFactory =  RuleConfigParserFactoryMap.getParserFactory(fileSuffix);
        IRuleConfigParser parser = ruleConfigFactory.create();
        // FIXME: 2023/5/19 差异在这里



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
