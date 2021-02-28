public class Solution {
    int a;
    public Solution(int a){
        this.a=a;
    }
public void Solve(){
    System.out.println(a);
}
    public static void main(String[] args){
        int a=100;
        Solution x=new Solution(a);
        x.Solve();
    
    }
}
