/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MildReed Zaarv'
 */
import java.util.Random;
public class MathTest {
    
    public Double Raiz(){
        return Math.sqrt(37);
    }
    
    public Double Sen(){
        Double a=Math.toRadians(300);
        return Math.sin(a);
    }
    
    public Double Cos(){
        Double a=Math.toRadians(300);
        return Math.cos(a);
    }
    public Double redondear(){
        return Math.ceil(22.8);
    }
    public Double red1(){
        return Math.floor(22.8);
    }
    public Integer Aleatorio(){
        Random r=new Random();
        int n=r.nextInt(20)+1;
        return n;
     }
    
    
}
