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
        //Datos para el primer objeto
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
        //Datos para el segundo objeto
        System.out.println("Ingrese su número de certificado");
        int c2=in.nextInt();
        System.out.println("Introduzca su apellido");
        String a2=in.next();
        System.out.println("Introduca el saldo disponible");
        int s2=in.nextInt();
        System.out.println("Introduzca el día, mes y año de emisión");
        int d2=in.nextInt();
        int m2=in.nextInt();
        int aa2=in.nextInt();
        GregorianCalendar uno=new GregorianCalendar();
        uno.set(aa1, m1, d1);
        GregorianCalendar dos=new GregorianCalendar();
        uno.set(aa2, m2, d2);
        CertificateOfDeposit objeto1=new CertificateOfDeposit(c1,a1,s1,uno);
        CertificateOfDeposit objeto2=new CertificateOfDeposit(c2,a2,s2,dos);
        
        System.out.println("DATOS DEL PRIMER DEPÓSITO");
        System.out.println("Número de certificado "+objeto1.getcertificado());
        System.out.println("Apellido "+objeto1.getapellido());
        System.out.println("Saldo "+objeto1.getsaldo());
        System.out.println("Fecha de emision: "+objeto1.getemision());
        System.out.println("Fecha de vencimiento "+objeto1.getVencimiento());
        
        
        
        
        
    }
    
}
