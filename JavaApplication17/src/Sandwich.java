/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MildReed Zaarv'
 */
public class Sandwich {
    private Bread uno;
    private SandwichFilling dos;
    
    public Sandwich(String pan, Integer cal, String relleno, Integer cal2){
        uno=new Bread(pan, cal);
        dos= new SandwichFilling(relleno, cal2);
    }
    
    public Integer getunoC(){
        return uno.getcalorias();
    }
    
    public Integer getdosC(){
        return dos.getcalorias();
    }
    
    public String getunoP(){
        return uno.getPan();
    }
    
    public String getdosR(){
        return dos.getrelleno();
    }
    
    
        
    
    
    
}
