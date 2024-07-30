import java.util.*;

public class test {
    // boolean solution(String s) {
    //     boolean answer = true;

    //     if (s.indexOf("(") == 0 && s.lastIndexOf(")") == s.length()-1) {
    //         int Num = 0;

    //         for (int i=0; i<s.length(); i++) {
    //             if (s.charAt(i) == '(') {
    //                 Num++;
    //             } else if (Num <=0){
    //                 return false;
    //             } else if(s.charAt(i) == ')') {
    //                 Num--;
    //             } 
    //         }
    //         answer = Num ==0;
    //     } else {
    //         answer = false;
    //     }

    //     return answer;
    // }

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
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) throws Exception {
        String s = "(()(()))";
        test ap = new test();

        System.out.println(ap.solution(s));
    }
}
