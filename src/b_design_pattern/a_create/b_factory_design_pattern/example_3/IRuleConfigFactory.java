package b_design_pattern.a_create.b_factory_design_pattern.example_3;

import b_design_pattern.a_create.b_factory_design_pattern.IRuleConfigParser;

/**
 * 工厂方法
 * </br>
 * 当我们新增一种 parser 的时候，只需要新增一个实现了 IRuleConfigParserFactory 接口的 Factory 类即可。
 * 所以，工厂方法模式比起简单工厂模式更加符合开闭原则（OCP原则：对扩展开放，对修改关闭）。
 * 但是停留在这一步的话对简单工厂的使用就会不太友好。见本包的RuleConfigSource
 * @author liwencai
 * @since 2023/5/19
 */
public abstract class IRuleConfigFactory {
    public abstract IRuleConfigParser create();
}
