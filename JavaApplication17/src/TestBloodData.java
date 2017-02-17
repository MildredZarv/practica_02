/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MildReed Zaarv'
 */
public class TestBloodData {
    public static void main(String[]args){
        BloodData p1=new BloodData();
        System.out.println("Tipo de sangre de la persona 1");
        System.out.println(p1.gettipo()+""+p1.getfactor());
        
        BloodData p2=new BloodData("A", '-');
        System.out.println("Tipo de sangre de la persona 2");
        System.out.println(p2.gettipo()+""+p2.getfactor());
    }
    
}
