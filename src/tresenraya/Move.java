/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tresenraya;

/**
 *
 * @author gabriel
 */
public class Move {
    int col;
    int row;
    
    Move(){
        col = 0;
        row = 0;
    }
    
    public Move(int c, int r){
        col = c;
        col = r;
    }
    
    int getCol(){
        return col;
    }
    
    int getRow(){
        return row;
    }
}
