/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MildReed Zaarv'
 */
public class Bread {
    private String Pan;
    private Integer calorias;
    
    public Bread(String a, Integer n){
       Pan=a;
       calorias=n;
       
    }
    
    public String getPan(){
        return Pan;
    }
    public Integer getcalorias(){
        return calorias;
    }
    public void MOTTO(){
        System.out.println("The staff of life");
    }
    
    
}
