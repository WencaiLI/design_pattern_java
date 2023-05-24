package b_design_pattern.b_structure.g_flyweight_design_pattern.example_1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liwencai
 * @since 2023/5/24
 */
public class Editor {
    private List<Character> chars = new ArrayList<>();

    public void appendCharacter(char c, Font font, int size, int colorRGB) {
        Character character = new Character(c, CharacterStyleFactory.getStyle(font, size, colorRGB));
        chars.add(character);
    }
}
