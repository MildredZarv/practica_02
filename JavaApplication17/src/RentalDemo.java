
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MildReed Zaarv'
 */

//este es el nuevo
import java.util.Scanner;
public class RentalDemo {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        Rental r=new Rental();
        String contrato=NumContrato();
        int n=min();
        Rental r2=new Rental(contrato,n);
        //iNFORMACI�N DEL PRIMER OBJETO
        System.out.println("N�mero de contrato \t"+r.getContractNumber());
        System.out.println("N�mero de horas \t"+r.getNOHFTR());
        System.out.println("Minutos pasados de la hora: \t"+r.getminutesOverAnHour());
        System.out.println("Precio \t$"+r.getprice());
        
        
        //Informaci�n del segundo objeto
        System.out.println("\nN�mero de contrato \t"+r2.getContractNumber());
        System.out.println("N�mero de horas \t"+r2.getNOHFTR());
        System.out.println("Minutos pasados de la hora: \t"+r2.getminutesOverAnHour());
        System.out.println("Precio \t$"+r2.getprice());
        

        
    }
    
    public static String NumContrato(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese n�mero de contraro");
        String contrato=teclado.next();
        return contrato;
    }
    public static Integer min(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduzca el  n�mero de minutos que usar� el equipo");
        int m=teclado.nextInt();
        return m;
    }
    
}

