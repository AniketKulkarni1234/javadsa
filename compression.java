public class compression
{   
      public static String compressions(String str)
      { 
        String newsstr="";// StringBuilder sb = new StringBuilder("")
        for(int i =0 ; i<str.length();i++)
        {
           Integer count=1;
           char ch =str.charAt(i);
           
           while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
           {
             count++;
             i++;
           }
           newsstr+=str.charAt(i);
           if(count>1){
            newsstr+=count.toString();
           }
        }
         return newsstr;
      }
    public static void main(String args[])
    {
       String str="aaabbcccdd";
       System.out.println(compressions(str));

    }
}