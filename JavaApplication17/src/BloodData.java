/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MildReed Zaarv'
 */
public class BloodData {
    private String tipo;
    private char factor;
    
    public BloodData(){
        tipo="O";
        factor='+';
    }
    
    public BloodData(String x, char y){
        tipo=x;
        factor=y;
    }
    
    public void settipo(String a){
        tipo=a;
    }
    
    public String gettipo(){
        return tipo;
    }
    
    public void setfactor(char y ){
        factor=y;
    }
    
    public char getfactor(){
        return factor;
    }
    
    
}
