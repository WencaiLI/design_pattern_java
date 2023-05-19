package b_design_pattern.a_create.b_factory_design_pattern;

/**
 * @author liwencai
 * @since 2023/5/19
 */
public abstract class IRuleConfigParser {
    public abstract RulerConfig parser(String configTest);
}
