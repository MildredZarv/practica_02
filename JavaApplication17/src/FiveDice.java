/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MildReed Zaarv'
 */
public class FiveDice {
    private Die[] dados;
    
    public FiveDice(Integer n){
        n=5;
            for (int i = 0; i < n; i++) {
                dados[i]=new Die();
            }
            
    }
    
    public void contador(){
        int [] f=new int[6];
        for (int i = 0; i < 6; i++) {
            f[i]=0;
        }
        
        for (int i = 0; i < dados.length; i++) {
            f[dados[i].getnumero()-1]++;
           imprimir( f[dados[i].getnumero()-1]);
        }
    }
    public void imprimir(Integer n){
        System.out.println(n);
        
    }
    
    public static void main(String[]args){
        FiveDice a= new FiveDice(5);
        a.contador();
        
        
    }
    
    
    
}
