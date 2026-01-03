import java.util.*;

public class StackB6 {
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            // Opening bracket
            if(ch=='(' || ch=='{' || ch=='['){
                s.push(ch);
            }
            else { // Closing bracket
                if(s.isEmpty()) return false;

                char top = s.peek();

                // Check correct match
                if( (top=='(' && ch==')') ||
                    (top=='{' && ch=='}') ||
                    (top=='[' && ch==']') ) {

                    s.pop(); 
                }
                else {
                    return false;
                }
            }
        }

        return s.isEmpty();
    }
    public static boolean isDuplicate(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch==')'){
                int count=0;
                while(s.peek()!='('){
                    s.pop();
                    count++;

                }
                if(count<1){
                    return true; //duplicate
                }
                else{
                    s.pop();
                }
            }
            else{
                //opening
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str="({})[]";
        String str1="((a+b))";
        String str2="(a-b)";
        System.out.println(isDuplicate(str1));
    }
}
