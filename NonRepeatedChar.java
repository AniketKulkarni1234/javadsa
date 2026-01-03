import java.util.Queue;

public class NonRepeatedChar {
    public static void NonRepeating(String str)
    {
      int freq[]=new int[26];
      Queue<Character>qt=new java.util.LinkedList<>();
      for(int i=0;i<str.length();i++)
      {
        char ch=str.charAt(i);
        qt.add(ch);
        freq[ch-'a']++;
        while(!qt.isEmpty() && freq[qt.peek()-'a']>1)
        {
            qt.remove();
        }
        if(qt.isEmpty()){
            System.out.println(-1+" ");
        }else{
            System.out.println(qt.peek());
        }
      }
      System.out.println();

    }
    public static void main(String[] args) {
        String str="aabccxb";
        NonRepeating(str);
    }
    
}
