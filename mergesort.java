public class mergesort
{    public static void prints(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
          System.out.println(arr[i]+"");
        }
        System.out.println();
    }
     public static void mergesorts(int arr[],int si,int ei)
     {
        if(si>=ei)
        {
            return;
        }
     int mid=si+(ei-si)/2;
     mergesorts(arr, si,mid); //left
     mergesorts(arr, mid+1, ei);//right
     merge(arr,si,mid,ei);
     }
     public static void merge(int arr[],int si,int mid,int ei)
     {
          int temp[]=new int[ei-si+1];
          int i=si;//left
          int j=mid+1;//right
          int k=0;// temp array
          while(i<=mid && j<=ei)
          {
            if(arr[i]<arr[j])
            {
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
              k++;
          }
          //left
          while (i<=mid) {
            temp[k++]=arr[i++];
          }
          //right
          while(j<=ei)
          {
            temp[k++]=arr[j++];
          }
          //copy temp to original;
          for(k=0,i=si; k<temp.length;k++,i++)
          {
            arr[i]=temp[k];
          }
     }

    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        mergesorts(arr,0,arr.length-1);
        prints(arr);
    }
}