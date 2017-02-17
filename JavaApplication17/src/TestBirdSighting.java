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
public class TestBirdSighting {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        //Constructos sin parámetros
        BirdSighting ave=new BirdSighting();
        System.out.println(ave.getespecie());
        System.out.println(ave.getdia());
        System.out.println(ave.getnumero());
        
        
        System.out.println("Ingrese la especie del ave");
        String g=in.next();
        System.out.println("Ingrese el número de aves vistas");
        int n=in.nextInt();
        System.out.println("Ingrese el día -número entero-");
        int a=in.nextInt();
        //Constructor con parámetros
        BirdSighting ave1=new BirdSighting(g,n,a);
        System.out.println(ave1.getespecie());
        System.out.println(ave1.getdia());
        System.out.println(ave1.getnumero());
        
    }
    
}
