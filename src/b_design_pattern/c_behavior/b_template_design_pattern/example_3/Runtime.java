package b_design_pattern.c_behavior.b_template_design_pattern.example_3;

import java.util.Collection;
import java.util.IdentityHashMap;

public class Runtime {
  public static void addShutdownHook(Thread hook) {
    SecurityManager sm = System.getSecurityManager();
    if (sm != null) {
      sm.checkPermission(new RuntimePermission("shutdownHooks"));
    }
    ApplicationShutdownHooks.add(hook);
    ApplicationShutdownHooks.runHooks();
  }
}

