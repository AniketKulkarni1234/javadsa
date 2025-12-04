public class tilingProblem
{
      public static int choice(int n)
      {
        if(n==0 || n==1)
        {
            return 1;
        }
        int fnm1= choice(n-1);
        int fnm2= choice(n-2);
        int totalways=fnm1+fnm2;
        return totalways;
      }
    public static void main (String args[])
    { 
        int n=3;
      System.out.println(choice(n));
    }
}