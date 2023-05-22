package b_design_pattern.b_structure.a_proxy_design_pattern.example_2;

import b_design_pattern.b_structure.a_proxy_design_pattern.MetricsCollector;
import b_design_pattern.b_structure.a_proxy_design_pattern.UserController;

import java.lang.reflect.Proxy;

/**
 * @author liwencai
 * @since 2023/5/22
 */
public class MetricsCollectorProxy {
    private MetricsCollector metricsCollector;

    public MetricsCollectorProxy() {
        this.metricsCollector = new MetricsCollector();
    }

    public Object createProxy(Object proxiedObject){
        Class<?>[] interfaces = proxiedObject.getClass().getInterfaces();

        DynamicProxyHandler dynamicProxyHandler = new DynamicProxyHandler(proxiedObject, metricsCollector);
        return Proxy.newProxyInstance(proxiedObject.getClass().getClassLoader(), interfaces,dynamicProxyHandler);
    }

}
