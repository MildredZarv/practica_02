/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MildReed Zaarv'
 */
import java.util.GregorianCalendar;
public class NextMonth {
    public Integer mes(){
        GregorianCalendar date= new GregorianCalendar();
        return date.get(GregorianCalendar.DAY_OF_MONTH);
    }
    
    
}
