package b_design_pattern.a_create.b_factory_design_pattern.example_5;

import b_design_pattern.a_create.b_factory_design_pattern.IRuleConfigParser;
import b_design_pattern.a_create.b_factory_design_pattern.ISystemConfigParser;
import b_design_pattern.a_create.b_factory_design_pattern.JsonRuleConfigParser;
import b_design_pattern.a_create.b_factory_design_pattern.JsonSystemConfigParser;

public class JsonConfigParserFactory implements IConfigParserFactory {
  @Override
  public IRuleConfigParser createRuleParser() {
    return new JsonRuleConfigParser();
  }

  @Override
  public ISystemConfigParser createSystemParser() {
    return new JsonSystemConfigParser();
  }
}