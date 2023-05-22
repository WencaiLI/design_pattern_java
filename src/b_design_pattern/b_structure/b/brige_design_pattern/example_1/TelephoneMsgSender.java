package b_design_pattern.b_structure.b.brige_design_pattern.example_1;

import java.util.List;

/**
 * @author liwencai
 * @since 2023/5/22
 */
public class TelephoneMsgSender implements MsgSender {
    private List<String> telephones;

    public TelephoneMsgSender(List<String> telephones) {
        this.telephones = telephones;
    }

    @Override
    public void send(String message) {
        //...
    }

}
