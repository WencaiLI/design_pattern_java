package b_design_pattern.c_behavior.h_memento_design_pattern;

/**
 * @author liwencai
 * @since 2023/7/10
 */
public class InputText {
    StringBuilder text = new StringBuilder();

    public String getText(){
        return text.toString();
    }

    public void setText(String text){
        this.text.replace(0, this.text.length(), text);
    }

    public void append(String input){
        text.append(input);
    }
}
