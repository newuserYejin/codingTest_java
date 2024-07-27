import java.util.*;

public class App {
    public int solution(int[] nums) {
        int answer = 0;
        int totalNum = nums.length/2;
            HashSet<Integer> set = new HashSet<>();
        
        for(int i : nums){
            set.add(i);
        }
        
        if(set.size()<totalNum){
            answer = set.size();
        } else if(set.size() > totalNum){
            answer = totalNum;
        } else{
            answer = totalNum;
        }
        
        return answer;
    }

    public static void main(String[] args) throws Exception {
        int[] nums = {3,3,3,2,2,2};
        App ap = new App();
        int result = ap.solution(nums);

        System.out.println(result);
    }
}
