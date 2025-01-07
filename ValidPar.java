import java.util.*;

public class ValidPar {
    public static boolean isValid(String str) {
        java.util.Stack<Character> s = new java.util.Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                s.push(c);
            }
            else{
                if (s.isEmpty()) {
                    return false;
            }
            if((s.peek()=='('  && c == ')')
            || (s.peek()=='{' && c == '}')
            || (s.peek()=='[' && c == ']'))
            {
                s.pop();
                }
            else{
                return false;
            }


        }
    
    }
    if(s.isEmpty()){
        return true;
        }
        else{
            return false;
            }
    }
    public static void main(String[] args) {
       String str = "[{]";
       System.out.println(isValid(str));

    }
}

