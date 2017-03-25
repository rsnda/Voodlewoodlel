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
public class NameModifier {

    private char voyelles[] = {'a', 'e', 'i', 'o', 'u', 'y'};
    
    public NameModifier() {
        
    }
    
    public String Voodleize(String nom){
        String voodlename = "";
        
        for(int i = 0; i < nom.length(); i++)
        {
            voodlename += this.CheckVowel(nom.charAt(i));
        }
        
        return voodlename;
    }
    
    private String CheckVowel(char c){
        
        for(int i = 0; i < this.voyelles.length; i++){
            if(c == this.voyelles[i]){
                return "oodle";
            }
        }
        
        return String.valueOf(c);
    }
        
}
