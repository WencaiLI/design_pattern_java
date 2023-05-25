package b_design_pattern.c_behavior.b_template_design_pattern.example_3;

/**
 * 钩子
 */
public class ShutdownHookDemo {

  private static class ShutdownHook extends Thread {
    public void run() {
      System.out.println("I am called during shutting down.");
    }
  }

  public static void main(String[] args) {
    Runtime.addShutdownHook(new ShutdownHook());
  }

}