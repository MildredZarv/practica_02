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
    private Die dado;
    
//    public int[] Dados(Integer n){
//        int [] dados=new int[n];
//        for (int i = 0; i < n; i++) {
//           dados[i]=dado.getnumero();
//        }
//        return dados;
//    }
//    //determine el dado más alto
//    public Integer comparar(Integer []a){
//        
//    }
//            
            
    //aplicación que aleatoriamente "arroje" dos dados y muestre sus valores. 
    public static void main(String[]args){
        Scanner teclado=new Scanner(System.in);
        Die dado1=new Die();
        Die dado2=new Die();
        MostrarNumero(dado1);
        MostrarNumero(dado2);
        if(dado1.getnumero()>dado2.getnumero()){
            System.out.println("El mayor es el dado 1: "+dado1.getnumero());
            
        }else if(dado2.getnumero()>dado1.getnumero()){
            System.out.println("El mayor es el dado 2 "+dado2.getnumero());
        }else{
            System.out.println("Los dados son iguales");
        }
 
    }
    
    public static void MostrarNumero(Die e){
        System.out.println(e.getnumero());
    }
    
}
