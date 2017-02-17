
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MildReed Zaarv'
 */
public class YearEnd {
     
//       public static Integer año(){
//        GregorianCalendar date= new GregorianCalendar();
////           System.out.println("day of month "+date.get(GregorianCalendar.DAY_OF_MONTH));
////           System.out.println("Day of week in month "+date.get(GregorianCalendar.DAY_OF_WEEK_IN_MONTH));
////           System.out.println("All styles "+date.get(GregorianCalendar.ALL_STYLES));
//           System.out.println(date.get(GregorianCalendar.YEAR));
//           System.out.println("DAY OF YEAR "+date.get(GregorianCalendar.DAY_OF_YEAR));
//           
//           
//        return date.get(GregorianCalendar.YEAR);
//    }
    
       public  Integer dias(){
           GregorianCalendar date=new GregorianCalendar();
           if(date.get(GregorianCalendar.YEAR)%4==0){
                System.out.println("Faltan "+(366-date.get(GregorianCalendar.DAY_OF_YEAR))+" días para que se acabe el año");
                return 366-date.get(GregorianCalendar.DAY_OF_YEAR);
           }else{
                System.out.println("Faltan "+(365-date.get(GregorianCalendar.DAY_OF_YEAR))+" días para que se acabe el año");
                return 365-date.get(GregorianCalendar.DAY_OF_YEAR);
           }
       }
    
}
