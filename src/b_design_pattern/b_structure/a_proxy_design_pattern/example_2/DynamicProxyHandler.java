package b_design_pattern.b_structure.a_proxy_design_pattern.example_2;


import b_design_pattern.b_structure.a_proxy_design_pattern.MetricsCollector;
import b_design_pattern.b_structure.a_proxy_design_pattern.RequestInfo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author liwencai
 * @since 2023/5/22
 */
public class DynamicProxyHandler implements InvocationHandler {


    private final Object proxiedObject;

    private final MetricsCollector metricsCollector;

    public DynamicProxyHandler(Object proxiedObject, MetricsCollector metricsCollector) {
        this.proxiedObject = proxiedObject;
        this.metricsCollector = metricsCollector;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long startTimestamp = System.currentTimeMillis();
        Object result = method.invoke(proxiedObject, args);
        long endTimeStamp = System.currentTimeMillis();
        long responseTime = endTimeStamp - startTimestamp;
        String apiName = proxiedObject.getClass().getName() + ":" + method.getName();
        RequestInfo requestInfo = new RequestInfo(apiName, responseTime, startTimestamp);
        metricsCollector.recordRequest(requestInfo);
        return result;
    }
}
