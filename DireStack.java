import java.util.*;

public class DireStack {

    public static void Directory(String path) {

        Stack<String> stack = new Stack<>();

        // split path by '/'
        String[] parts = path.split("/");

        // 🔁 NORMAL FOR LOOP (1st loop)
        for (int i = 0; i < parts.length; i++) {

            String part = parts[i];

            if (part.equals("") || part.equals(".")) {
                // ignore empty or current directory
                continue;
            }
            else if (part.equals("..")) {
                // go to parent directory
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
            else {
                // normal directory name
                stack.push(part);
            }
        }

        // build final path
        if (stack.isEmpty()) {
            System.out.println("/");
            return;
        }

        String result = "";

        // 🔁 NORMAL FOR LOOP (2nd loop)
        for (int i = 0; i < stack.size(); i++) {
            result = result + "/" + stack.get(i);
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        String str = "/../";
        Directory(str);
    }
}
