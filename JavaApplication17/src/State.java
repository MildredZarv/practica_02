/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MildReed Zaarv'
 */
public class State {
    private String nombre;
    private Integer poblacion;
    private City uno;
    private City dos;
    
    
    public State(String n1, Integer p1, String Cap1, Integer mp1, String Cap2, Integer mp2){
        nombre=n1;
        poblacion=p1;
        uno.setmasPoblada(Cap1);
        uno.setpopulation(mp1);
        dos.setmasPoblada(Cap2);
        dos.setpopulation(mp2);
    }
    
    
      public void setnombre(String a){
          nombre=a;
      }
      public void setpoblacion(Integer n1){
          poblacion=n1;
      }
       public String getnombre(){
        return nombre;
       }
       public Integer getpoblacion(){
           return poblacion;
       }
    
    private class City{
       private String masPoblada;
       private Integer population;
       
       public void setmasPoblada(String a){
           masPoblada=a;
       }
       public void setpopulation(Integer a){
           population=a;
       }
       public String getmasPoblada(){
           return masPoblada;
       }
       public Integer getpopulation(){
           return population;
       }
    }
    
}
