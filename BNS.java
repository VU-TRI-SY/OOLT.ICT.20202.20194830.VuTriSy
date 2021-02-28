import java.util.Scanner;
class Nodebns{
   int data;
   Nodebns left,right;
   Nodebns(int data){
      this.data=data;
      left=right=null;
   }
}
class Bns{
    
   public static Nodebns insert(Nodebns root,int value){
      if(root==null){
         return new Nodebns(value);
      }
      else{
         if(value<root.data){
            root.left=insert(root.left,value);
         }else{
            root.right=insert(root.right,value);
         }
      }
      return root;
   }
   /*public static void insert(Nodebns Nodebns,int value){
       if(value<=Nodebns.data){
           if(Nodebns.left==null){
               Nodebns.left=new Nodebns(value);
           }else{
               insert(Nodebns.left,value);
           }
       }else{
           if(Nodebns.right==null){
               Nodebns.right=new Nodebns(value);
           }else{
               insert(Nodebns.right,value);
           }
       }
   }*/
   public static void print(Nodebns Nodebns){
      if(Nodebns==null) return;
      System.out.print(Nodebns.data+"->");
      print(Nodebns.left);
      print(Nodebns.right);
   }
   public static void main(String[] args){
      Scanner scan=new Scanner(System.in);

      int n=scan.nextInt();
      Nodebns root=null;
      for(int i=0;i<n;i++){
         int value=scan.nextInt();
         root=insert(root,value);
      }
      scan.close();
      print(root);
   }
}