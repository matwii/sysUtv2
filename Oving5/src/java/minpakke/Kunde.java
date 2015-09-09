/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minpakke;

/**
 *
 * @author Matz
 */
public class Kunde {
    private String navn;
    private String id;
    
    public String getNavn(){
        return navn;
    }
    
    public String getId(){
        return id;
    }
    
    public void setNavn(String nyNavn){
        navn = nyNavn;
    }
    
    public void setId(String nyId){
        this.id = nyId;
    }
}
