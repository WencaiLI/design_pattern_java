package b_design_pattern.b_structure.g_flyweight_design_pattern.example_1;

/**
 * @author liwencai
 * @since 2023/5/24
 */
public class Character {
    private char c;
    private CharacterStyle style;

    public Character(char c, CharacterStyle style) {
        this.c = c;
        this.style = style;
    }
}
