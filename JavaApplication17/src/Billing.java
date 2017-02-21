
import java.util.Scanner;
public class Billing {
    
    public double computeBill(Integer precio){
        return precio*0.08;
    }
    public double computeBill(Integer a, Integer b){
        return (a*b + a*b*0.08);
    }
    public double computeBill(Integer a, Integer b, Double c){
        return (a*b -c)*(1.08);
        
    }
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        Billing objeto=new Billing();
        System.out.println("Ingrese el precio del libro");
        int n=in.nextInt();
        System.out.println("Usted deberá pagar $"+objeto.computeBill(n));
        System.out.println("Ingrese la cantidad que desee");
        int a=in.nextInt();
        System.out.println("Usted deberá pagar $"+objeto.computeBill(n, a));
        System.out.println("Ingrese el valor del cupón");
        double c=in.nextDouble();
        System.out.println("Usted deberá pagar $"+objeto.computeBill(n,a,c));
     }
}
