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
    private Die []dados;
    private Integer numeroDados;
    
    public FiveDice(Integer n){
        numeroDados=n;
        dados=new Die[n];
        for (int i = 0; i < n; i++) {
          dados[i] = new Die();
        }
    }
    public void lanzar (){
        for (int i = 0; i < this.numeroDados; i++) {
            dados[i].Mostrar();   
        }
    }
    public Integer resultado(){
        int []contador={0,0,0,0,0,0};
        for (int i = 0; i < numeroDados; i++) {
            contador[dados[i].getnumero()-1]++;   
        }
    int mayor=0;
        for (int i = 0; i < 6; i++) {
            if(contador[i]>mayor){
                mayor=contador[i];
            }
            
        }
        return mayor;
    }
    
   public static void main(String[] args) {
        FiveDice a1 = new FiveDice(5);
        FiveDice a2 = new FiveDice(5);
        System.out.println("Dados del jugador 1");
        a1.lanzar();
        System.out.println("\nDados del jugador 2");
        a2.lanzar();
        
        if(a1.resultado()==a2.resultado()){
            System.out.println("\nEmpate");
        }else if (a1.resultado()>a2.resultado()){
            System.out.println("\nGanó el jugador 1");
        }else{
            System.out.println("\nGanó el jugador 2");
        }
    }
}

    

