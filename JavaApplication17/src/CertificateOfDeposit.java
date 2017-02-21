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
    private GregorianCalendar Vencimiento;
    
    public  CertificateOfDeposit(Integer n, String a, Integer s, GregorianCalendar m){
        certificado=n;
        apellido=a;
        saldo=s;
        emision=new GregorianCalendar();
        emision=m;
        Vencimiento=new GregorianCalendar();
        Vencimiento.set(m.get(GregorianCalendar.YEAR)+1,m.get(GregorianCalendar.MONTH),m.get(GregorianCalendar.DAY_OF_MONTH));
        
        
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
        Vencimiento=m;
    }
    public String  getVencimiento(){
        String a;
         a=Vencimiento.get(GregorianCalendar.DAY_OF_MONTH)+"/"+Vencimiento.get(GregorianCalendar.MONTH)+"/"+Vencimiento.get(GregorianCalendar.YEAR);
        return a;
    }
   
    
    
    
    
}
    
