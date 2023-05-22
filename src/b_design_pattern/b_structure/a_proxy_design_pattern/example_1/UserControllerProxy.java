package b_design_pattern.b_structure.a_proxy_design_pattern.example_1;

import b_design_pattern.b_structure.a_proxy_design_pattern.MetricsCollector;
import b_design_pattern.b_structure.a_proxy_design_pattern.RequestInfo;
import b_design_pattern.b_structure.a_proxy_design_pattern.UserVo;

/**
 *
 * 代理模式（Proxy Design Pattern）的原理和代码实现都不难掌握。
 * 它在不改变原始类（或叫被代理类）代码的情况下，通过引入代理类来给原始类附加功能。
 * </br>
 * 例子1种通过接口的方式实现对原始类的代理（基于组合）这样的方式更加精确的到方法级进行代理，但是这样的方式也有缺点：
 * 一方面，我们需要在代理类中，将原始类中的所有的方法，都重新实现一遍，并且为每个方法都附加相似的代码逻辑。
 * 另一方面，如果要添加的附加功能的类有不止一个，我们需要针对每个类都创建一个代理类。
 * </br>
 * 使用场景：
 *  * 1.业务系统的非功能性需求开发：代理模式最常用的一个应用场景就是，在业务系统中开发一些非功能性需求，比如：监控、统计、鉴权、限流、事务、幂等、日志。
 *  * 我们将这些附加功能与业务功能解耦，放到代理类中统一处理，让程序员只需要关注业务方面的开发。
 *  * 2.代理模式在 RPC、缓存中的应用：代理模式在 RPC、缓存中的应用实际上，RPC 框架也可以看作一种代理模式，GoF 的《设计模式》一书中把它称作远程代理。
 *  * 通过远程代理，将网络通信、数据编解码等细节隐藏起来。客户端在使用 RPC 服务的时候，就像使用本地函数一样，
 *  * 无需了解跟服务器交互的细节。除此之外，RPC 服务的开发者也只需要开发业务逻辑，就像开发本地使用的函数一样，不需要关注跟客户端的交互细节。
 * @author liwencai
 * @since 2023/5/22
 */
public class UserControllerProxy implements IUserController{

    MetricsCollector metricsCollector; // 依赖注入

    UserController userController; // 依赖注入


    @Override
    public UserVo login(String telephone, String password) {
        long startTimestamp = System.currentTimeMillis();
        UserVo login = userController.login(telephone, password);
        long endTimeStamp = System.currentTimeMillis();
        long responseTime = endTimeStamp - startTimestamp;
        RequestInfo requestInfo = new RequestInfo("login", responseTime, startTimestamp);
        metricsCollector.recordRequest(requestInfo);
        return login;
    }

    @Override
    public UserVo register(String telephone, String password) {
        long startTimestamp = System.currentTimeMillis();
        UserVo register = userController.register(telephone, password);
        long endTimeStamp = System.currentTimeMillis();
        long responseTime = endTimeStamp - startTimestamp;
        RequestInfo requestInfo = new RequestInfo("login", responseTime, startTimestamp);
        metricsCollector.recordRequest(requestInfo);
        return register;
    }
}
