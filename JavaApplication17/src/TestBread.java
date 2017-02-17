/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MildReed Zaarv'
 */
public class TestBread {
    public static void main(String[]args){
        Bread pan1=new Bread("Centeno", 120);
        Bread pan2=new Bread("Integral", 81);
        Bread pan3=new Bread("Francés", 215);
        System.out.println("A continuación se muestra el tipo de pan y las calorías que tiene por rebanada");
        System.out.println(pan1.getPan()+" "+pan1.getcalorias());
        System.out.println(pan2.getPan()+" "+pan2.getcalorias());
        System.out.println(pan3.getPan()+" "+pan3.getcalorias());
        
    }
    
}
