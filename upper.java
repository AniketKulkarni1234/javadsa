public class upper
{
    public static String uppercase(String st)
    {
        StringBuilder sb=new StringBuilder();
        char ch=Character.toUpperCase(st.charAt(0));
        sb.append(ch);
       for(int i=1;i<st.length();i++)
       {
        if(st.charAt(i)==' ' && i<st.length()-1) 
        {   
            sb.append(st.charAt(i));
            i++;
            sb.append(Character.toUpperCase(st.charAt(i)));

        }
        else{
            sb.append(st.charAt(i));

        }
       }
       return sb.toString();
    }

    public static void main(String args[])
    {
        String st="i am aniket";
        System.out.print(uppercase(st));
    }
}