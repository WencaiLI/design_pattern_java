package b_design_pattern.b_structure.e_facade_design_pattern.example_1;

import java.util.HashMap;
import java.util.Map;

/**
 * 以下这个例子解决的是性能问题
 * 还可以解决易用性问题，Linux的Shell脚本
 * 适配器是做接口转换，解决的是原接口和目标接口不匹配的问题。
 * 门面模式做接口整合，解决的是多接口调用带来的问题。
 * 假设有一个系统 A，提供了 a、b、c、d 四个接口。系统 B 完成某个业务功能，需要调用 A 系统的 a、b、d 接口。
 * 利用门面模式，我们提供一个包裹 a、b、d 接口调用的门面接口 x，给系统 B 直接使用。不知道你会不会有这样的疑问，让系统 B 直接调用 a、b、d 感觉没有太大问题呀，为什么还要提供一个包裹 a、b、d 的接口 x 呢？关于这个问题，我通过一个具体的例子来解释一下。
 * 假设我们刚刚提到的系统 A 是一个后端服务器，系统 B 是 App 客户端。App 客户端通过后端服务器提供的接口来获取数据。我们知道，App 和服务器之间是通过移动网络通信的，网络通信耗时比较多，为了提高 App 的响应速度，我们要尽量减少 App 与服务器之间的网络通信次数。
 * 假设，完成某个业务功能（比如显示某个页面信息）需要“依次”调用 a、b、d 三个接口，因自身业务的特点，不支持并发调用这三个接口。
 * @author liwencai
 * @since 2023/5/24
 */

// @RestController
public class FrontController {

    private Service service;

    // @GetMapping("/back")
    Map<String, Object> back(){
        Object a = service.a();
        Object b = service.b();
        Object c = service.c();
        Map<String,Object> map = new HashMap<>();
        map.put("a",a);
        map.put("b",b);
        map.put("c",c);
        return null;
    }
}
