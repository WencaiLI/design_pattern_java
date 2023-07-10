package b_design_pattern.c_behavior.h_memento_design_pattern;

import java.util.Stack;

/**
 * @author liwencai
 * @since 2023/7/10
 */
public class SnapshotHolder {
    Stack<InputText> snapshots = new Stack<>();

    public InputText popSnapshot() { return snapshots.pop(); }

    public void pushSnapshot(InputText inputText){
        InputText deepClonedInputText = new InputText();
        deepClonedInputText.setText(inputText.getText());
        snapshots.push(deepClonedInputText);
    }
}
