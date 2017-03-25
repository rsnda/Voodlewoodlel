/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voodlewoodlel;


/**
 *
 * @author Erjon
 */
public class Voodlewoodlel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NameModifier myVw = new NameModifier();
        
        System.out.println(myVw.Voodleize("Bob"));
        System.out.println(myVw.Voodleize("Peeves"));
        System.out.println(myVw.Voodleize("Sinistra"));
        System.out.println(myVw.Voodleize("Bhlm"));
    }
    
}
