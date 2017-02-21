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
public class TwoDice {
    
    public static void main(String[]args){
        Die dado1=new Die();
        Die dado2=new Die();
        dado1.Mostrar();
        dado2.Mostrar();
        
        if(dado1.getnumero()>dado2.getnumero()){
            System.out.println("El mayor es el dado 1: "+dado1.getnumero());
            
        }else if(dado2.getnumero()>dado1.getnumero()){
            System.out.println("El mayor es el dado 2 "+dado2.getnumero());
        }else{
            System.out.println("Los dados son iguales");
        }
 
    }
    
}
