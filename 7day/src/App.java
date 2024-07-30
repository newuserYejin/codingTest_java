import java.lang.reflect.Array;
import java.util.*;

public class App {

    public List<Integer> solution(int []arr) {
        List<Integer> answer = new ArrayList<>();

        answer.add(arr[0]);

        for(int i=1; i<arr.length;i++){
            if (arr[i] != arr[i-1]) {
                answer.add(arr[i]);
            }
        }
    
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        App ap = new App();
        
        List<Integer> result = ap.solution(arr);
        System.out.println(result);
    }
}
