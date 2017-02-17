/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MildReed Zaarv'
 */
public class Rental {
    public final static Integer tarifa=40;
     public final static Integer MAH=60;
     private String ContractNumber="K681";
     private Integer NOHFTR;
     private Integer minutesOverAnHour;
     private Integer price;
     
     public Rental(){
         Rental a=new Rental("A000", 0);
         NOHFTR=39;
         minutesOverAnHour=0;
         price=1;
     }
     public Rental(String NumCont, Integer minAd){
         this.setHoursAndMinutes(minAd);
         this.setContractNumber(NumCont);
         
     }
   
    public void setContractNumber(String a){
        ContractNumber=a;
    }
    
    public void setHoursAndMinutes(Integer minutes){
        NOHFTR=minutes/60;
        minutesOverAnHour=minutes%60;
        price=this.tarifa*NOHFTR + minutesOverAnHour; 
        
    }
    
    public String getContractNumber(){
        return ContractNumber;
    }
    public Integer getNOHFTR(){
        return NOHFTR;
    }
    public Integer getminutesOverAnHour(){
        return minutesOverAnHour;
    }
    public Integer getprice(){
        return price;
    }
}

    

