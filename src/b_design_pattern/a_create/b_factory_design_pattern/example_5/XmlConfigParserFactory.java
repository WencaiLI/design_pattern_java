package b_design_pattern.a_create.b_factory_design_pattern.example_5;

import b_design_pattern.a_create.b_factory_design_pattern.IRuleConfigParser;
import b_design_pattern.a_create.b_factory_design_pattern.ISystemConfigParser;
import b_design_pattern.a_create.b_factory_design_pattern.XmlRuleConfigParser;
import b_design_pattern.a_create.b_factory_design_pattern.XmlSystemConfigParser;

public class XmlConfigParserFactory implements IConfigParserFactory {
  @Override
  public IRuleConfigParser createRuleParser() {
    return new XmlRuleConfigParser();
  }

  @Override
  public ISystemConfigParser createSystemParser() {
    return new XmlSystemConfigParser();
  }
}