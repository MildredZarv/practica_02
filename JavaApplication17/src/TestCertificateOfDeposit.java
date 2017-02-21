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
        
        System.out.println("Ingrese su número de certificado");
        int c1=in.nextInt();
        System.out.println("Introduzca su apellido");
        String a1=in.next();
        System.out.println("Introduca el saldo disponible");
        int s1=in.nextInt();
        System.out.println("Introduzca el día, mes y año de emisión");
        int d1=in.nextInt();
        int m1=in.nextInt();
        int aa1=in.nextInt();
        //Primer objeto con creado con la información recibida del teclado
        GregorianCalendar uno=new GregorianCalendar();
        uno.set(aa1,m1,d1);
        CertificateOfDeposit objeto1=new CertificateOfDeposit(c1,a1,s1,uno);
        
        
        //Creación del segundo objeto con información  asignada desde el programa.
        GregorianCalendar dos=new GregorianCalendar();
        dos.set(2017,05,22);
        CertificateOfDeposit objeto2=new CertificateOfDeposit(981027,"Zaragoza",1234567,dos);
        
        
        System.out.println("DATOS DEL PRIMER DEPÓSITO");
        System.out.println("Número de certificado: "+objeto1.getcertificado());
        System.out.println("Apellido: "+objeto1.getapellido());
        System.out.println("Saldo:           \t$"+objeto1.getsaldo());
        System.out.println("Fecha de emision: \t"+objeto1.getemision());
        System.out.println("Fecha de vencimiento: \t"+objeto1.getVencimiento());
        System.out.println("DATOS DEL SEGUNDO DEPÓSITO\n");
        System.out.println("Número de certificado: \t"+objeto2.getcertificado());
        System.out.println("Apellido: "+objeto2.getapellido());
        System.out.println("Saldo:            \t$"+objeto2.getsaldo());
        System.out.println("Fecha de emision: \t"+objeto2.getemision());
        System.out.println("Fecha de vencimiento: \t"+objeto2.getVencimiento());
        
        
        
        
        
        
    }
    
}
