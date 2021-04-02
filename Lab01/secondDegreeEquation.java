import java.util.Scanner;
public class secondDegreeEquation {
    double a;
    double b;
    double c;
    public secondDegreeEquation(double a,double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public void Solve(){
        if(a==0) System.out.println("It is not a second degree equation.");
        else{
            double delta=Math.pow(b,2)-4*a*c;
            if(delta<0){
                System.out.println("The equation has no solution.");
            }else{
                if(delta==0) System.out.println("The equation has doule root: -"+(double) b/(2*a));
                else System.out.println("The equation has two distinct roots: "+(double)((Math.pow(delta,0.5)-b)/(2*a))+" and " +(double)((-Math.pow(delta,0.5)-b)/(2*a))) ;
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 factors of second degree equation:");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        secondDegreeEquation secondE =new secondDegreeEquation(a,b,c);
        secondE.Solve();
        sc.close();
    }
}
