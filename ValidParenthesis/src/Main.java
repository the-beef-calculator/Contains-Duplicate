import java.util.HashMap;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }

    public static boolean isValid(String str)
    {
        HashMap<Character,Character> brackets = new HashMap<>();
        Stack<Character> stack = new Stack<Character>();
        brackets.put(')','(');
        brackets.put(']','[');
        brackets.put('}','{');

        for (int i = 0; i < str.length(); i++)
        {
            if (brackets.containsKey(str.charAt(i)))
            {
                if(!stack.isEmpty() && stack.peek() == brackets.get(str.charAt(i)))
                {
                    stack.pop();
                }
                else
                {
                    return false;
                }
            }
            else
            {
                stack.push(str.charAt(i));
            }
        }
        return stack.isEmpty();


    }
}