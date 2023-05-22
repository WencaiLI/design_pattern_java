package b_design_pattern.b_structure.b.brige_design_pattern;

/**
 * @author liwencai
 * @since 2023/5/22
 */ //在API监控告警的例子中，我们如下方式来使用Notification类：
public class ErrorAlertHandler extends AlertHandler {
    public ErrorAlertHandler(AlertRule rule, Notification notification) {
        super(rule, notification);
    }


    @Override
    public void check(ApiStatInfo apiStatInfo) {
        if (apiStatInfo.getErrorCount() > super.rule.getMatchedRule(apiStatInfo.getApi()).getMaxErrorCount()) {
            super.notification.notify(NotificationEmergencyLevel.SEVERE, "...");
        }
    }
}
