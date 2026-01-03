public class Divide_Array {
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4};
        int k=3;
        int n=arr.length;
        int div=0;
        if(n%2!=0)
        {
             div=(n+1)/k;   
        }
        else{
            div=n/k;
        }
        int sum1=0,sum2=0;
        for(int i=0;i<div;i++)
        {
                sum1+=arr[i];
               // System.out.println(arr[i]);
        }
        System.out.println(sum1);
        for(int i=div;i<n;i++)
        {
              sum2+=arr[i];
        }
            System.out.println(sum2);
       if(sum1<=sum2)
       {
        System.out.println("maximum sum"+sum2);
       }
       else{
        System.out.println("maximum sum"+sum1);
       }
    }
    
}
