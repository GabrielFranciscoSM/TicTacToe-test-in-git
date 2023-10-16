/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tresenraya;

/**
 *
 * @author gabriel
 */
public class HumanPlayer extends Player{
    
    @Override
    void makeMove(){
                Move move = game.getPlayerInput();
        
        while(game.getBoard().isValidMove(move)){
            move = game.getPlayerInput();
        }
        
        game.getBoard().makeMove(move, mark);
    }
    
}
