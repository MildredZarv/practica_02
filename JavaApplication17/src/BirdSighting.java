/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MildReed Zaarv'
 */
public class BirdSighting {
     private String especie;
    private Integer numero;
    private Integer dia;
    
    public BirdSighting(){
        especie="robin";
        numero=1;
        dia=1;
    }
    
    public void setespecie(String a){
       especie=a;
    }
    public String getespecie(){
        return especie;
    }
    
    public void setnumero(Integer n){
        numero=n;
    }
    public Integer getnumero(){
        return numero;
    }
    public void setdia(Integer m){
        dia=m;
    }
    public Integer getdia(){
        return dia;
    }
    //Segundo constructor (con parámetros)
    public BirdSighting(String e, Integer n, Integer d){
        especie=e;
        numero=n;
        dia=d;
    }
    
}

