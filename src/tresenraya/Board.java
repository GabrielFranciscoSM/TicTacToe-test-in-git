/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tresenraya;

/**
 *
 * @author gabriel
 */
public class Board {
    
    char[][] cells = new char[3][3];
    Game game = new Game();
    
    Board(){
        for(int i = 0; i < 3; ++i){
            for(int j = 0; j < 3; ++j){
                cells[i][j] =  ' ';
            }
        }
    }
    
    boolean isValidMove(Move m){
        return (cells[m.row][m.row] == ' ');
    }
    
    void makeMove(Move m, char mark){
        cells[m.row][m.row] = mark;
    }
    
    void paint(){
        game.makeMove();
    }
    
    boolean checkForWinner(){
        
    }
    
    boolean isFull(){
        boolean full = true;
        for(int i = 0; i < 3; ++i){
            for(int j = 0; j < 3; ++j){
                full &= cells[i][j] !=  ' ';
            }
        }
        
        return full;
    }
    
}
