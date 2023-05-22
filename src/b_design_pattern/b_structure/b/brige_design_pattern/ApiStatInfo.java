package b_design_pattern.b_structure.b.brige_design_pattern;

/**
 * @author liwencai
 * @since 2023/5/22
 */
public class ApiStatInfo {
    Long errorCount;
    String matchedRule;
    String api;

    public Long getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(Long errorCount) {
        this.errorCount = errorCount;
    }

    public String getMatchedRule() {
        return matchedRule;
    }

    public void setMatchedRule(String matchedRule) {
        this.matchedRule = matchedRule;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }
}
