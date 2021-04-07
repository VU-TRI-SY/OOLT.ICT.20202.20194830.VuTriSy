import java.util.*;
public class Calculation {
    public static void main(String[] args){
        System.out.printf("Enter number a and b:");
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        System.out.println("a + b = "+(a+b));
        System.out.println("a - b = "+(a-b));
        System.out.println("a x b = "+(a*b));
        if(b==0){
        System.out.println("Cannot not divide");
        }else 
        System.out.println("a : b = "+(a/b));
    }
}
