/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MildReed Zaarv'
 */
public class Circle {
    private Integer radio;
    private Integer diametro;
    private Double area;
    
    public Circle(){
        radio=1;
        diametro=radio*2;
        area=Math.PI*Math.pow(radio, 2);
    }
    
    public void setRadius(Integer n){
        radio=n;
        diametro=radio*2;
        area=Math.PI*Math.pow(radio, 2);
        
    }
    public Integer getRadius(){
        return radio;
    }
    
    public Integer getDiametro(){
        return diametro;
    }
    public Double getarea(){
        return area;
    }
          
}
