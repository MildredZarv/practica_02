/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MildReed Zaarv'
 */
import java.util.Scanner;
import java.util.GregorianCalendar;
public class TestCertificateOfDeposit {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        
        System.out.println("Ingrese su n�mero de certificado");
        int c1=in.nextInt();
        System.out.println("Introduzca su apellido");
        String a1=in.next();
        System.out.println("Introduca el saldo disponible");
        int s1=in.nextInt();
        System.out.println("Introduzca el d�a, mes y a�o de emisi�n");
        int d1=in.nextInt();
        int m1=in.nextInt();
        int aa1=in.nextInt();
        //Primer objeto con creado con la informaci�n recibida del teclado
        GregorianCalendar uno=new GregorianCalendar();
        uno.set(aa1,m1,d1);
        CertificateOfDeposit objeto1=new CertificateOfDeposit(c1,a1,s1,uno);
        
        
        //Creaci�n del segundo objeto con informaci�n  asignada desde el programa.
        GregorianCalendar dos=new GregorianCalendar();
        dos.set(2017,05,22);
        CertificateOfDeposit objeto2=new CertificateOfDeposit(981027,"Zaragoza",1234567,dos);
        
        
        System.out.println("DATOS DEL PRIMER DEP�SITO");
        System.out.println("N�mero de certificado: "+objeto1.getcertificado());
        System.out.println("Apellido: "+objeto1.getapellido());
        System.out.println("Saldo:           \t$"+objeto1.getsaldo());
        System.out.println("Fecha de emision: \t"+objeto1.getemision());
        System.out.println("Fecha de vencimiento: \t"+objeto1.getVencimiento());
        System.out.println("DATOS DEL SEGUNDO DEP�SITO\n");
        System.out.println("N�mero de certificado: \t"+objeto2.getcertificado());
        System.out.println("Apellido: "+objeto2.getapellido());
        System.out.println("Saldo:            \t$"+objeto2.getsaldo());
        System.out.println("Fecha de emision: \t"+objeto2.getemision());
        System.out.println("Fecha de vencimiento: \t"+objeto2.getVencimiento());
        
        
        
        
        
        
    }
    
}
