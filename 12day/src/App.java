import java.util.Arrays;

public class App {
    public String solution(String s) {
        String[] list = s.split("");
        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();
        for(String c : list) sb.append(c);

        return sb.reverse().toString();
    }
    public static void main(String[] args) throws Exception {
        App ap = new App();
        String str = "Zbcdefg";

        System.out.println(ap.solution(str));
    }
}
