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
public class TestSandwichFilling {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        SandwichFilling p1=new SandwichFilling("Pollo", 258);
        SandwichFilling p2= new SandwichFilling("Jamón", 198);
        SandwichFilling p3=new SandwichFilling("Atún", 230);
        System.out.println("Relleno para Sandwich   \tCalorías   ");
        System.out.println("  \t"+p1.getrelleno()+"              \t"+p1.getcalorias());
        System.out.println("  \t"+p2.getrelleno()+"              \t"+p2.getcalorias());
        System.out.println("  \t"+p3.getrelleno()+"              \t"+p3.getcalorias());
    }
    
}
