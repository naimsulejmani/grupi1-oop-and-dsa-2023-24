package oop.interfaces.ushtrime1;

public class ChessRule implements RuleSet{
    @Override
    public boolean isLegal(Move move, Board board) {
        //kontrollohet se levizja e shahut a eshte legale,
        return false;
    }

    @Override
    public void makeMove(Move move) {
        //nese eshte legale mundesh me bo levizjen
    }
}
