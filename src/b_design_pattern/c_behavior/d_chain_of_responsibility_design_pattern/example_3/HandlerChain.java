package b_design_pattern.c_behavior.d_chain_of_responsibility_design_pattern.example_3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liwencai
 * @since 2023/6/24
 */
public class HandlerChain {
    private List<IHandler> handlers = new ArrayList<>();

    public void addHandler(IHandler handler) {
        this.handlers.add(handler);
    }

    public void handle() {
        for (IHandler handler : handlers) {
            boolean handled = handler.handle();
            if (handled) {
                break;
            }
        }
    }
}
