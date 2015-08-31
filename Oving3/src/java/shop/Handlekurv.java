/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

/**
 *
 * @author Matz
 */
public class Handlekurv {
    private String vNavn;
    
    public Handlekurv(String vNavn){
        this.vNavn = vNavn;
    }
    
    public String finnNavn(){
        return vNavn;
    }
}
