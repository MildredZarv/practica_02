/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MildReed Zaarv'
 */
import java.util.GregorianCalendar;
public class CertificateOfDeposit {
    private Integer certificado;
    private String apellido;
    private Integer saldo;
    private GregorianCalendar emision;
    private GregorianCalendar fechaVencimiento;
    
    public  CertificateOfDeposit(Integer n, String a, Integer s, GregorianCalendar m){
        certificado=n;
        apellido=a;
        saldo=s;
        emision=m;
        fechaVencimiento.set(m.get(GregorianCalendar.YEAR)+1, m.get(GregorianCalendar.MONTH),m.get(GregorianCalendar.DAY_OF_MONTH ));
        
        
    }
    
     public void setcertificado(Integer m){
        certificado=m;
    }
    public Integer getcertificado(){
        return certificado;
    }
     public void setapellido(String a){
        apellido=a;
    }
    public String  getapellido(){
        return apellido;
    }
    public void setsaldo(Integer a){
        saldo=a;
    }
    public Integer  getsaldo(){
        return saldo;
    }
    public void setemision(GregorianCalendar m){
        emision=m;
    }
    public String  getemision(){
        String a;
        a=emision.get(GregorianCalendar.DAY_OF_MONTH)+"/"+emision.get(GregorianCalendar.MONTH)+"/"+emision.get(GregorianCalendar.YEAR);
        return a;
    }
    public void setVencimiento(GregorianCalendar m){
        fechaVencimiento=m;
    }
    public String  getVencimiento(){
        String a;
         a=emision.get(GregorianCalendar.DAY_OF_MONTH)+"/"+emision.get(GregorianCalendar.MONTH)+"/"+emision.get(GregorianCalendar.YEAR);
        return a;
    }
   
    
    
    
    
}
    
