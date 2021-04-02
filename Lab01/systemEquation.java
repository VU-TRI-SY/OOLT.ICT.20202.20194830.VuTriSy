import java.util.*;
public class systemEquation {
    double a11,a12,b1;
    double a21,a22,b2;
    public systemEquation(double a11,double a12,double b1,double a21,double a22,double b2){
        this.a11=a11;
        this.a12=a12;
        this.b1=b1;
        this.a21=a21;
        this.a22=a22;
        this.b2=b2;
    }
    public void Solve(){
        double D=a11*a22-a21*a12;
        double D1=b1*a22-b2*a12;
        double D2=a11*b2-a21*b1;
        if(D==0){
            if(D1==0&&D2==0) System.out.println("The system has infinitely manysolution.");
            else  System.out.println("The system has no solution.");
        }else
        System.out.println("The system has a solution (x1,x2) = "+"("+(double) D1/D +", "+(double) D2/D+")");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a11,a12,b1,a21,a22,b2 of sytem quation:");
        System.out.println("a11x+a12x=b1");
        System.out.println("a21x+a22x=b2");
        systemEquation systemE=new systemEquation(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        systemE.Solve();
    }
}
