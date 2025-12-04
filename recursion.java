public class recursion {
    public static void  printDec(int n)
    {
         if(n==1)
         {
            System.out.println(n);
            return;
         }
         System.out.print(n+" ");
         printDec(n-1);
    }

    public static void printAsc(int n)
    {
        if(n==1)
        {
            System.out.print(n+" ");
            return;
        }
        printAsc(n-1);
        System.out.print(n+" ");
    }
    public static int fact(int n)
    {
        if(n==0)
        {
        return 1;
        }
      int fnm1= fact(n-1);
      int fn= n*fact(n-1);

      return fn;
    }
    public static int fibino(int n)
    {
        if(n==0||n==1)
        {
            return n;
        }
        int fnm1=fibino(n-1);
        int fnm2=fibino(n-2);
        int fn=fnm1+fnm2;
        return fn;
    }

    public static boolean sorted(int arr[],int i)
    {
        if(i==arr.length-1)
        {
            return true;

        }

        if(arr[i]>arr[i+1])
        {
            return false;
        }
        return sorted(arr,i+1);
    }

    public static int firstocc(int arr[],int key,int i)
    {
        if(i==arr.length-1)
        {
            return -1;
        }
         if (arr[i]==key)
         {
            return i;
         }
         return firstocc(arr, key, i+1);
    }

    public static int lastocc(int arr[],int key,int i)
    {
        
        if(i==arr.length)
        {
            return -1;
        }
        int isFound=lastocc(arr, key, i+1);

        if(isFound==-1 && arr[i]==key)
        {
            return i;
        }
        return isFound;
    }

    public static void main(String args[])
    {
        // int n=20;
        //printDec(n);
        //printAsc(n);
       // System.out.println(fact(n));
        
        //System.out.println(fibino(n));

        int arr[]={1,2,5,4,5};
        int key=5;
        int i=0;
        //System.out.println(sorted(arr, 0));
        System.out.println(lastocc(arr, key,i));
    }
    
}
