import java.util.*;

public class App {
    public long solution(long n) {
        // 입력받은 n을 String 형태의 배열로 변환
        String[] str = String.valueOf(n).split("");
        
        // Collections 쓰려면  List, Set, Map 이여야 한다.
        List<String> list = Arrays.asList(str);

        list.sort(Collections.reverseOrder());
        System.out.println(list.toString());

        String answer = String.join("", list);
        return Long.valueOf(answer);
    }

    public static void main(String[] args) throws Exception {
        App ap = new App();
        long num = 118372;

        System.out.println(ap.solution(num));
    }
}
