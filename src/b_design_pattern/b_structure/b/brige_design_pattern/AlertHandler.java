package b_design_pattern.b_structure.b.brige_design_pattern;

/**
 * @author liwencai
 * @since 2023/5/22
 */
public abstract class AlertHandler {

    AlertRule rule;
    Notification notification;
    public AlertHandler(AlertRule rule, Notification notification) {
        this.notification = notification;
        this.rule = rule;
    }

    abstract void check(ApiStatInfo apiStatInfo);
}
