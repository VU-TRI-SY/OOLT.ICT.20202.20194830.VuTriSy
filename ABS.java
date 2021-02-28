class Str {
    static void timeConversion(String s) {
        /*
         * Write your code here.
         */
        
        char c=s.charAt(8);
        String[] S=s.split(":",2);
        int a=Integer.parseInt(S[0]);
        if(c=='A'){
            if(a==12) a=0;
        }
        else{
            if(a<12) a+=12;
        }
        
        StringBuffer sb= new StringBuffer(S[1]);
        sb.deleteCharAt(sb.length()-1);
        sb.deleteCharAt(sb.length()-1);
        System.out.printf("%02d:%s",a,sb);
    

    }
    public static void main(String[] args){
       String s="04:59:59AM";
       timeConversion(s);
       
    } 
}
/**if(a==0){
            String result=a+"0:"+sb;
            return result;
        }else {
            if(a<10){
                String result="0"+a+":"+sb;
                return result;
            }else{
                String result=a+":"+sb;
                return result;
            }
        }
        */