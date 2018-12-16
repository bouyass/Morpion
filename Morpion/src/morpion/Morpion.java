/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morpion;

import morpion.Controlleur.Controlleur;
import morpion.Vue.Vue;

/**
 *
 * @author lyes
 */
public class Morpion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Vue vue = new Vue();
         Controlleur ctrl = new Controlleur(vue);
       
        
    }
    
}
