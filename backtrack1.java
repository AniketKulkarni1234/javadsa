public class backtrack1 {
    public static void subset(String str,int i,String ans)
    {
        if(i==str.length())
        {
            if(ans.length()==0){
                System.out.println("null");
            }else{
             System.out.println(ans);
            }
            return;
        }
        // yes choice 
        subset(str, i+1,ans+str.charAt(i));
        // no choice
        subset(str,i+1,ans);
    }
    public static void main(String[] args) {
        String str ="abc";
        subset(str, 0,"");
    }
}
