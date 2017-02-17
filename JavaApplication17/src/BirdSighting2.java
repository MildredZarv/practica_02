/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MildReed Zaarv'
 */
public class BirdSighting2 {
     private String especie;
    private Integer numero;
    private Integer dia;
    
    public BirdSighting2(){
        BirdSighting pajarillo=new BirdSighting(especie, numero, dia);
               
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
    
    
}

//Cree una clase con la misma funcionalidad que la clase BirdSighting, pero cree el constructor predeterminado
//para llamar al constructor de tres parámetros. Guarde la clase como BirdSighting2.java. 
//Cree una aplicación para probar la nueva versión de la clase y asígnele el nombre TestBirdSighting2.java