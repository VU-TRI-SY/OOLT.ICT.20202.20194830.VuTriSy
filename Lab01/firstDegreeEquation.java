import java.util.Scanner;
public class firstDegreeEquation {
    double a;
    double b;
    public firstDegreeEquation(double a,double b){
        this.a=a;
        this.b=b;
    }
    public void Solve(){
        if(a==0) System.out.println("The equation has no solution.");
        else System.out.println("The euqation has solution:x="+(float) -b/a);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a and b of equation ax+b=0:");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        firstDegreeEquation equation=new firstDegreeEquation(a,b);
        equation.Solve();
        sc.close();
    }
}

