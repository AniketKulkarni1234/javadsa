public class backtrack {
    public static void backarr(int arr[],int i,int val)
    {
        if(i==arr.length)
        {
            prints(arr);
            return;

        }
        arr[i]=val;
        backarr(arr, i+1, val+1); //recursion
        arr[i]=arr[i]-2; //backtrack
    }
    public static void prints(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
          System.out.println(arr[i]+"");
        }
        //System.out.println();
    }
    public static void main (String args[])
    {
         int arr[]= new int[5];
        backarr(arr, 0, 1);
        prints(arr);
    }
}
