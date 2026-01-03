import java.util.Stack;

public class nxtGreater {
    public static void findnxtG(int arr[])
    {   Stack<Integer>s=new Stack<>();
        int nxtg[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--)
        {
            while(!s.isEmpty() && arr[s.peek()]<=arr[i])
            {
                s.pop();
            }
            if(s.isEmpty()){
                nxtg[i]=-1;
            }
            else{
                nxtg[i]=arr[s.peek()];
            }
            s.push(i);
        }
        for(int i=0;i<nxtg.length;i++)
        {
            System.out.print(nxtg[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        findnxtG(arr);


    }
}
