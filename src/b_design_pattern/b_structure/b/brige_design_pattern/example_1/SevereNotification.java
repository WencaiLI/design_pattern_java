package b_design_pattern.b_structure.b.brige_design_pattern.example_1;

/**
 * @author liwencai
 * @since 2023/5/22
 */
public class SevereNotification extends Notification {
    public SevereNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        msgSender.send(message);
    }
}
