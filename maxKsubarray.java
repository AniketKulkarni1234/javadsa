public class maxKsubarray {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,4,5,2,3,6};
        int k=3;
        int max=0;
        int Maxval=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<k+i;j++)
            {
               if(arr[j]>max)
               {
                max=arr[j];
               }
            }   
            System.out.println(max);
        }

    }
    
}
