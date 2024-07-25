import java.util.ArrayList;
import java.util.List;

public class App {

    // 비기너 문제

    // public int solution(String s) {
    //     int answer = Integer.parseInt(s);
    //     return answer;
    // }

    public String solution(String s) {
        List<Integer> index = new ArrayList<>();

        int find = s.indexOf(" ");

        while (find >= 0) {
            index.add(find);
            find = s.indexOf(" ", find + 1);
        }

        String lowerCaseString = s.toLowerCase();           // 전체 소문자 변경
        StringBuilder sb = new StringBuilder(lowerCaseString);

        // 문자열의 첫 문자가 대문자가 되어야 하는 경우
        if (sb.length() > 0 && Character.isLetter(sb.charAt(0))) {
            char firstChar = sb.charAt(0);
            sb.setCharAt(0, Character.toUpperCase(firstChar));
        }

        for (int i : index) {
            if (i + 1 < sb.length()) { // 공백이 문자열의 마지막이 아닌 경우
                char nextChar = sb.charAt(i + 1);
                sb.setCharAt(i + 1, Character.toUpperCase(nextChar));
            }
        }

        return sb.toString();
    }
    
    public static void main(String[] args) throws Exception {
        String str = "3people unFollowed me";
        App ap = new App();
        String result = ap.solution(str);
        System.out.println(result);
    }
}
