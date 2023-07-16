package b_design_pattern.c_behavior.i_command_design_pattern;

/**
 * @author liwencai
 * @since 2023/7/15
 */
public class Request {
    private Event event;

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}
