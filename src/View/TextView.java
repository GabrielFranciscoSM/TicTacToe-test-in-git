/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.util.Scanner;
import tresenraya.Move;
/**
 *
 * @author gabriel
 */
public class TextView {
    
    private Scanner myObj = new Scanner(System.in);  // Create a Scanner object

    public Move getUserInput(){
        System.out.println("Enter col");
        String input = myObj.nextLine();  // Read user input
        System.out.println("Enter row");
        input += myObj.nextLine();
        
        System.out.println("Prueba resultado: " + input);
        
        return stringToMove(input);
    }
    
    private Move stringToMove(String str){
        return new Move(Character.getNumericValue(str.charAt(0)), Character.getNumericValue(str.charAt(1)));
    }
}
