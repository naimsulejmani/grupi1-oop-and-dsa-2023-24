package oop.interfaces.ushtrime1;

public class Main {
    public static void main(String[] args) {
        //femija ruahet automatikisht te prindi
        // upcasting
        Board board = new ChessBoard();
        RuleSet ruleSet = new ChessRule();
        Move move = new PawnMove();

        //me kete metode mundemi tash me lujt secilen loje qe ka board
        // dhe ka dicka qe leviz move objekt
        if(ruleSet.isLegal(move,board)) {
            move.move();
        }

        // mundemi me bo downcasting
        if(ruleSet instanceof ChessRule) {
            //prindi duhet me u castu manualisht tek femija nese ka nevoje
            ChessRule chessRule = (ChessRule) ruleSet;
        }


    }
}
