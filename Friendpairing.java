public class Friendpairing
{  
    public static int pairs(int n)
    {
    if(n==1 || n==2)
    {
        return n;
    }
    //single
    int fnm1=pairs(n-1);

    //pair
    int fnm2=pairs(n-2);
    int pairways=(n-1)*fnm2;
    int totalways=fnm1+pairways;
    return totalways; //return pairs(n-1)+(n-1)*pairs(n-2)
    }
    public static void main(String[] args) {
       System.out.println(pairs(3)); 
    }
}