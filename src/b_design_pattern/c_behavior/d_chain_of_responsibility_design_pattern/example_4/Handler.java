package b_design_pattern.c_behavior.d_chain_of_responsibility_design_pattern.example_4;

public abstract class Handler {
  protected Handler successor = null;

  public void setSuccessor(Handler successor) {
    this.successor = successor;
  }

  public final void handle() {
    doHandle();
    if (successor != null) {
      successor.handle();
    }
  }

  protected abstract void doHandle();
}

