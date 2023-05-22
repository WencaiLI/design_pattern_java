package b_design_pattern.b_structure.b.brige_design_pattern;

/**
 * @author liwencai
 * @since 2023/5/22
 */
public class AlertRule {
//    AlertRule matchedRule;
    String api;
    Long maxErrorCount;
    public AlertRule getMatchedRule(String api) {
        return new AlertRule();
    }

    public Long getMaxErrorCount() {
        return maxErrorCount;
    }

    public void setMaxErrorCount(Long maxErrorCount) {
        this.maxErrorCount = maxErrorCount;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }
}
