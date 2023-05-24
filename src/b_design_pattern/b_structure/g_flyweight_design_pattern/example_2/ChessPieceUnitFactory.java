package b_design_pattern.b_structure.g_flyweight_design_pattern.example_2;

import java.util.HashMap;
import java.util.Map;

/**
 * 通过工厂模式产生的对象是可复用的对象，是共享的单元，而且是不可变的对象。
 *
 * @author liwencai
 * @since 2023/5/24
 */
public class ChessPieceUnitFactory {
    private static final Map<Integer, ChessPieceUnit> pieces = new HashMap<>();

    static {
        pieces.put(1, new ChessPieceUnit(1, "車", ChessPieceUnit.Color.BLACK));
        pieces.put(2, new ChessPieceUnit(2, "馬", ChessPieceUnit.Color.BLACK));
        //...省略摆放其他棋子的代码...
    }

    public static ChessPieceUnit getChessPiece(int chessPieceId) {
        return pieces.get(chessPieceId);
    }
}
