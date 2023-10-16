/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tresenraya;

import Controller.Controller;

/**
 *
 * @author gabriel
 */
public class Game {
    Board board;
    Player player1;
    Player player2;
    Player currPlayer;
    
    Controller controller = new Controller();
    
    void play(){
        boolean end;
                
        do{
            currPlayer.makeMove();
            end = board.checkForWinner();
            end |= board.isFull();
        }while(!end);
    }
    
    Board getBoard(){
        return board;
    }
    
    Move getPlayerInput(){
        return controller.getPlayerInput();
    }
    
    void makeMove(){
        controller.makeMove(board);
    }
}
