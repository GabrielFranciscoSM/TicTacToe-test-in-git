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
    
    Board(){
        for(int i = 0; i < 3; ++i){
            for(int j = 0; j < 3; ++j){
                cells[i][j] =  ' ';
            }
        }
    }
    
    boolean isValidMove(Move m){
        return true;
    }
    
    void makeMove(Move m){
        
    }
    
    void paint(){
        
    }
    
    void checkForWinner(){
        
    }
    
    boolean isFull(){
        return true;
    }
    
}
