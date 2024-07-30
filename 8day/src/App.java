import java.util.*;

public class App {
    boolean solution(String s) {
        char[] str = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        if(str[0] != '('){
            return false;
        }

        for(char c : str){
            if (c == '(') {
                stack.push(c);
            } else{
                if (stack.isEmpty()) {
                    return false;
                }

                if(stack.peek() == '('){
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }
    public static void main(String[] args) throws Exception {
        String s = "(())()";
        App ap = new App();

        System.out.println(ap.solution(s));
    }
}
