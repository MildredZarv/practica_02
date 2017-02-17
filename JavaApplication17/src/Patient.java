/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MildReed Zaarv'
 */
public class Patient {
    private String ID;
    private Integer edad;
    private String tipo;
    private char factor;
    
    public Patient(){
        ID="0";
        edad=0;
        tipo="O";
        factor='+';
    
    }
    
    public Patient(String id, Integer e, String t, char f){
        ID=id;
        edad=e;
        tipo=t;
        factor=f;
    }
    
    public void setID(String id){
        ID=id;
    }
    
    public String getID(){
        return ID;
    }
    
    public void setedad(Integer e){
        edad=e;
    }
    
    public Integer getedad(){
        return edad;
    }
    
    public void settipo(String t){
        tipo=t;
    }
    public String gettipo(){
        return tipo;
    }
    
    public void setfactor(char f){
        factor=f;
    }
    public char getfactor(){
        return factor;
    }
}
