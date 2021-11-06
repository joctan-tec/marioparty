/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marioparty;

import java.awt.Color;

/**
 *
 * @author Joctan Esquivel
 */
public class MarioParty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MenuPartida menu = new MenuPartida();
        menu.setVisible(true);
        menu.setBackground(new Color(49,49,49));
    }
    
}
