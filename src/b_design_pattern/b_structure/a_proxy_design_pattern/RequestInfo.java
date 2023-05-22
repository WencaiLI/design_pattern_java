package b_design_pattern.b_structure.a_proxy_design_pattern;

/**
 * @author liwencai
 * @since 2023/5/22
 */
public class RequestInfo {
    String operation;
    Long startRequestTime;
    Long responseTime;

    public RequestInfo(String operation,Long responseTime, Long startRequestTime) {
        this.operation = operation;
        this.startRequestTime = startRequestTime;
        this.responseTime = responseTime;
    }
}
