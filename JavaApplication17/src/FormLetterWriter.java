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
public class FormLetterWriter {
    private String nombre;
    private String apellido;
    
    public  FormLetterWriter(String n, String a){
        nombre=n;
        apellido=a;
        
    }
    public void displaySalutation(String a){
        System.out.println("Estimado Sr. o Sra. "+a);
        System.out.println("Gracias por su pedido reciente");
    }
    
    public void displaySalutation(String a, String b){
        System.out.println("Estimado "+a+ " "+b);
    }
    
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String n=in.next();
        System.out.println("Ingrese su apellido");
        String a=in.next();
        FormLetterWriter persona=new FormLetterWriter(n,a);
        persona.displaySalutation(persona.apellido);
        persona.displaySalutation(n,a);
        System.out.println("Gracias por su pedido reciente");
        
    }
}
