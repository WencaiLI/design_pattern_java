package b_design_pattern.b_structure.b.brige_design_pattern.example_1;

/**
 * @author liwencai
 * @since 2023/5/22
 */
public abstract class Notification {
    protected MsgSender msgSender;

    public Notification(MsgSender msgSender) {
        this.msgSender = msgSender;
    }

    public abstract void notify(String message);
}
