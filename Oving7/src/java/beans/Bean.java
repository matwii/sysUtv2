/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author Matz
 */
public class Bean {
    private String name;
    private String familyName;
    private int age;
    private String gender;
    private boolean spam;
    
    public Bean(){
    }
    
    public boolean getSpam(){
        return spam;
    }
    
    public void setSpam(boolean spam){
        this.spam = spam;
    }
    
    public String getFamilyName(){
        return familyName;
    }
    
    public void setFamilyName(String familyName){
        this.familyName = familyName;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public String getGender(){
        return gender;
    }
    
    public void setGender(String gender){
        this.gender = gender;
    }
}
