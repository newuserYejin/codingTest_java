import java.util.*;

public class App {
    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0.0;
        
        for(int i : arr){
            sum += i;
        }
        
        answer = sum / arr.length;
        return answer;
    }
    public static void main(String[] args) throws Exception {
        int x[] = {1,2,3,4,5,6};
        App ap = new App();

        System.out.println("mean value: "+ ap.solution(x));
    }
}
