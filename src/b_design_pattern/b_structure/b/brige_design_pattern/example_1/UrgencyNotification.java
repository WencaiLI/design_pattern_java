package b_design_pattern.b_structure.b.brige_design_pattern.example_1;

/**
 * @author liwencai
 * @since 2023/5/22
 */
public class UrgencyNotification extends Notification {
    public UrgencyNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {

    }
    // 与SevereNotification代码结构类似，所以省略...
}
