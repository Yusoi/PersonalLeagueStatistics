/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import main.business.PLS;
import main.presentation.LoginMenu;

/**
 *
 * @author yusoi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PLS facade = new PLS();

        //Open login window and center it.
        LoginMenu window = new LoginMenu(facade);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
    }
    
}
