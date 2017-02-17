/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MildReed Zaarv'
 */
public class TestSandwich {
    public static void main(String[]args){
        Sandwich uno=new Sandwich("Centeno", 120, "Atún", 156);
        Sandwich dos=new Sandwich("Francés", 230, "Pollo", 189);
        Sandwich tres=new Sandwich("Integral", 89, "Jamón", 78);
        
        System.out.println("CALORÍAS POR SANDWICH\nSandwich 1\nIngredientes:");
        System.out.println("Pan:     \t"+uno.getunoP()+"      \t"+uno.getunoC()+" kcal");
        System.out.println("Relleno: \t"+uno.getdosR()+"      \t"+uno.getdosC()+" kal");
        int n=2*(uno.getunoC()) + uno.getdosC();
        System.out.println("TOTAL DE kcal: \t"+n);
        
        System.out.println("\nSandwich 2");
        System.out.println("Pan:     \t"+dos.getunoP()+"      \t"+dos.getunoC()+" kcal");
        System.out.println("Relleno: \t"+dos.getdosR()+"      \t"+dos.getdosC()+" kcal");
        int n1=2*(dos.getunoC()) + dos.getdosC();
        System.out.println("TOTAL DE kcal: \t"+n1);
        
        System.out.println("\nSandwich 3");
        System.out.println("Pan:     \t"+tres.getunoP()+"      \t"+tres.getunoC()+" kcal");
        System.out.println("Relleno: \t"+tres.getdosR()+"      \t"+tres.getdosC()+" kcal");
        int n2=2*(tres.getunoC()) + tres.getdosC();
        System.out.println("TOTAL DE kcal: \t"+n2);
    }
    
}
