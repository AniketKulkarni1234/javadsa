import java.util.HashMap;
import java.util.Queue;

public class TopViewofBT {
    static class Node{
        Node left;
        Node right;
        int data;

        Node(int data)
        {
        this.data=data;
        this.left=null;
        this.right=null;
        }
    }
    static class Info{
        Node node;
        int hd;
        public Info(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
      public static void topview(Node root){
        Queue<Info>q=new LinkedList<>();
        HashMap<Integer,Node>map=new HashMap<>();
        int min=0,max=0;
        q.add(new Info(root, 0));
        q.add(null);
        while (!q.isEmpty()) 
        {
            Info curr=q.remove();
            if(curr==null){
                if(q.isEmpty())
                {
                    break;
                }
                else{
                    q.add(null);
                }
                if(!map.containsKey(curr.hd)){
                    map.put(curr.hd,curr.node);
                }
                if(curr.node.left!=null){
                    q.add(new Info(curr.node.left, curr.hd-1));
                    min=Math.min(min,curr.hd-1);
                }
                if(curr.node.right!=null){
                    q.add(new Info(curr.node.right,curr.hd+1));
                    max=Math.max(max,curr.hd+1);    
                }

            }
            
        }
        for(int i=min;i<=max;i++){
            System.out.println(map.get(i).data);
        }
      }
    }
    public static void main(String[] args) {
        
    }
    
}
