package oop.interfaces.ushtrime1;

public class CheckersRule implements RuleSet{
    @Override
    public boolean isLegal(Move move, Board board) {
        //logjiken se a eshte levijza legale ne boardin e vet
        return false;
    }

    @Override
    public void makeMove(Move move) {
        //edhe ketu e ban levizjen nese eshte legale
    }
}
