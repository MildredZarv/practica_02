/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MildReed Zaarv'
 */
public class Event {
    public final static Integer Price=35;
    public final static Integer value=50;
    private String NumEvento;
    private Integer Invitados;
    private Integer Precio;
    
    public Event(String a, Integer n, Integer b){
        this.Invitados=n;
        this.NumEvento=a;
        this.Precio=b;
    }
    
    public Event(String numEv, Integer numInv){
        this.setEventNumber(numEv);
        this.setGuests(numInv);
    }
    
    public Event(){
        Event uno=new Event("A000", 0);
    
    }
    
    public int getPrice(){
        return Price;
    }
     public String getNumEvento(){
        return NumEvento;
    }
    public int getInvitados(){
        return Invitados;
    }
     public int getPrecio(){
        return Precio;
    }
//    public void setNumEvento(String a){
//        this.NumEvento=a;
//    }
    
    public void setInvitados(Integer a){
        Invitados=a;
    }
    
    public void setPrecio(Integer a){
        Precio=a;
    }
    
    public  void setEventNumber(String n){
        NumEvento=n;
    }
    
//    public  void setGuests(Event A){ 
//        this.setPrecio(A.getInvitados()*this.getPrice());
//        
//    }
    public  void setGuests(Integer invitados){ 
        Invitados=invitados;
        Precio=(Invitados*this.getPrice());
        
    }
    
    public String DarNum(){
        return NumEvento;
    }
    
    public int inv(){
        return Invitados;
    }
    
    public int DarPrecio(){
        return Precio;
    }
    
}

    

