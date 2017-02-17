/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MildReed Zaarv'
 */
public class TestPatient {
     public static void main(String[]args){
        Patient p1=new Patient();
        System.out.println("Datos del paciente 1");
         System.out.println("ID: "+p1.getID());
         System.out.println("Edad: "+p1.getedad());
         System.out.println("Tipo de sangre: "+p1.gettipo()+""+p1.getfactor());
        
        Patient p2=new Patient("0141", 10, "AB", '+');
        System.out.println("Datos del paciente 2");
         System.out.println("ID: "+p2.getID());
         System.out.println("Edad: "+p2.getedad());
         System.out.println("Tipo de sangre: "+p2.gettipo()+""+p2.getfactor());
    }
    
}

    

