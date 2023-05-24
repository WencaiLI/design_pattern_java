package b_design_pattern.b_structure.g_flyweight_design_pattern.example_2;

/**
 * @author liwencai
 * @since 2023/5/24
 */
public class ChessPiece {
    private ChessPieceUnit chessPieceUnit;
    private int positionX;
    private int positionY;

    public ChessPiece(ChessPieceUnit unit, int positionX, int positionY) {
        this.chessPieceUnit = unit;
        this.positionX = positionX;
        this.positionY = positionY;
    }
    // 省略getter、setter方法
}
