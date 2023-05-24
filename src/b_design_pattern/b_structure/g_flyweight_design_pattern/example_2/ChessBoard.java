package b_design_pattern.b_structure.g_flyweight_design_pattern.example_2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liwencai
 * @since 2023/5/24
 */
public class ChessBoard {
    private Map<Integer, ChessPiece> chessPieces = new HashMap<>();

    public ChessBoard() {
        init();
    }

    private void init() {
        chessPieces.put(1, new ChessPiece(
                ChessPieceUnitFactory.getChessPiece(1), 0, 0));
        chessPieces.put(1, new ChessPiece(
                ChessPieceUnitFactory.getChessPiece(2), 1, 0));
        //...省略摆放其他棋子的代码...
    }

    public void move(int chessPieceId, int toPositionX, int toPositionY) {
        //...省略...
    }
}
