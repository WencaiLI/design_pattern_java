package b_design_pattern.a_create.b_factory_design_pattern.example_5;

import b_design_pattern.a_create.b_factory_design_pattern.IRuleConfigParser;
import b_design_pattern.a_create.b_factory_design_pattern.ISystemConfigParser;

/**
 * 在简单工厂和工厂方法中，类只有一种分类方式。比如，在规则配置解析那个例子中，解析器类只会根据配置文件格式（Json、Xml、Yaml……）来分类。
 * 但是，如果类有两种分类方式，比如，我们既可以按照配置文件格式来分类，
 * 也可以按照解析的对象（Rule 规则配置还是 System 系统配置）来分类，那就会对应下面这 8 个 parser 类。
 * </br>
 * 可以引用一个接口将两种分类方式标识出来并让工厂类去实现
 * 这种的弊端是必须都重写接口
 * @author liwencai
 */
public interface IConfigParserFactory {
  IRuleConfigParser createRuleParser();
  ISystemConfigParser createSystemParser();
  //此处可以扩展新的parser类型，比如IBizConfigParser
}