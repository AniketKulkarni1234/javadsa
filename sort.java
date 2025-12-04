public class sort
{
    public static void BubbleSort(int number[])
    {
        for(int i=0;i<number.length-1;i++)
        {
            for(int j=0;j<number.length-1-i;j++)
            {
               if(number[j]>number[j+1])
               {
                int temp = number[j];
                number[j]=number[j+1];
                number[j+1]=temp;
               }
            }
        }
    }
      public static void SelectionSort(int number[])
      {
        for(int i=0;i<number.length-1;i++)
        {  int min=i;
           for(int j=i+1;j<number.length-1;j++)
           {
            if(number[min]>number[j])
            {
                min=j;
            }
           }
           int temp=number[min];
           number[min]=number[i];
           number[i]=temp;
        }
      }

      public static void Insertion(int number[])
      {
        for(int i=1;i<number.length;i++)
        {   int curr=number[i];
            int prev=i-1;

            while(prev>=0 && number[prev]>number[curr]) 
            {
                number[prev+1]=number[prev];
                prev--;
            }
              number[prev+1]=number[curr];
        }
      }  
      
    public static void count(int number[])
    {    int largest=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++)
        {
            largest=Math.max(largest,number[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<number.length;i++)
        {
            count[number[i]]++;
        }
        int j=0;
        while (count[i]>0) {
            number[j]=i;
            j++;
            count[i]--;
        }
    }

      public static void prints(int number[])
      {
        for(int i=0;i<number.length;i++)
        {
          System.out.print(number[i]);
        }
      }
    public static void main(String args[])
    {
        int number []={2,4,1,6,7,8};
        //BubbleSort(number);
       // prints(number);
        SelectionSort(number);
        prints(number);
    }
}