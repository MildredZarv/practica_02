/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MildReed Zaarv'
 */
public class SandwichFilling {
    private String relleno;
    private Integer calorias;
    
    public SandwichFilling(String r, Integer c){
        relleno=r;
        calorias=c;
    }
    
    public String getrelleno(){
        return relleno;
    }
    public Integer getcalorias(){
        return calorias;
    }
    
    
}
