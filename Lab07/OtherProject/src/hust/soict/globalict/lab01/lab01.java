package hust.soict.globalict.lab01;

class First_degree_equation{
    double a;
    double b;
    public First_degree_equation(double a,double b){
        this.a=a;
        this.b=b;
    }
    public void Solve1(){
        if(a==0) System.out.println("The equation has no solution.");
        else System.out.println("The euqation has unique solution:x="+(float) a/b);
    }
}
class System_equation{
    double a11,a12,b1;
    double a21,a22,b2;
    public System_equation(double a11,double a12,double b1,double a21,double a22,double b2){
        this.a11=a11;
        this.a12=a12;
        this.b1=b1;
        this.a21=a21;
        this.a22=a22;
        this.b2=b2;
    }
    public void Solve2(){
        double D=a11*a22-a21*a12;
        double D1=b1*a22-b2*a12;
        double D2=a11*b2-a21*b1;
        if(D==0){
            if(D1==0&&D2==0) System.out.println("The system has infinitely manysolution.");
            else  System.out.println("The system has no solution.");
        }else
        System.out.println("The system has a unique solution (x1,x2) = "+"("+(double) D1/D +","+(double) D2/D+" )");
    }

}
class Second_degree_equation{
    double a;
    double b;
    double c;
    public Second_degree_equation(int a,int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public void Solve3(){
        if(a==0) System.out.println("It is not a second degree equation.");
        else{
            double delta=Math.pow(b,2)-4*a*c;
            if(delta<0){
                System.out.println("The equation has no solution.");
            }else{
                if(delta==0) System.out.println("The equation has doule root: -"+(double) b/(2*a));
                else System.out.println("The equation has two distinct roots: "+(double)((Math.pow(delta,1/2)-b)/(2*a))+" and " +(double)((-Math.pow(delta,1/2)-b)/(2*a))) ;
            }
        }
    }
}
class Solution{
    public static void main(String[] args){
        First_degree_equation task1=new First_degree_equation(2,3);
        task1.Solve1();
        System_equation task2=new System_equation(1,3,4,2,1,7);
        task2.Solve2();
        Second_degree_equation task3=new Second_degree_equation(2,5,2);
        task3.Solve3();
        

    }
}
