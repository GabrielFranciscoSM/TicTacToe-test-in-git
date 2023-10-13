/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import tresenraya.Game;
import tresenraya.Move;
import View.TextView;
/**
 *
 * @author gabriel
 */
public class Controller {
    Game game;
    TextView txtView = new TextView();
    
    public Move getPlayerInput(){
        return txtView.getUserInput();
    }
}
