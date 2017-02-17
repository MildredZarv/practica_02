/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MildReed Zaarv'
 */
public class TestCircle {
    public static void main(String[]args){
        Circle c1=new Circle();
        Circle c2=new Circle();
        Circle c3=new Circle();
        c1.setRadius(3);
        c2.setRadius(10);
        
        System.out.println("CÍRCULO 1");
        System.out.println("Radio:      "+c1.getRadius());
        System.out.println("Diametro:   "+c1.getDiametro());
        System.out.println("Área:       "+c1.getarea());
        
        System.out.println("\nCÍRCULO 2");
        System.out.println("Radio:      "+c2.getRadius());
        System.out.println("Diametro:   "+c2.getDiametro());
        System.out.println("Área:       "+c2.getarea());
        
        System.out.println("\nCÍRCULO 3");
        System.out.println("Radio:      "+c3.getRadius());
        System.out.println("Diametro:   "+c3.getDiametro());
        System.out.println("Área:       "+c3.getarea());
        
    }
    
}
