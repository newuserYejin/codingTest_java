import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
       public List<String> solution(int []arr) {
        List<String> answer = new ArrayList<>(arr.length);

        int[] test = arr.clone();
        Arrays.sort(test);      // 오름차순으로 정리 arr.length-1이 가장 큰 수

        // for(int i=0;i<arr.length;i++){
        //     int target = test[i];

        //     for(int j=0; j<arr.length;j++){
        //         if (arr[j] == target) {         // arr에서의 index위치 파악
        //             if (i == arr.length-1) {        // 정렬된 배열에서 제일 큰 값이였는지 확인(1,2,3위)
        //                 answer.add(j,"Gold Medal");
        //             } else if(i == arr.length-2){
        //                 answer.add(j,"Silver  Medal");
        //             } else if(i==arr.length-3){
        //                 answer.add(j,"Bronze   Medal");
        //             } else{
        //                 answer.add(j,j+"th");
        //             }
        //         }
        //     }
        // }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<test.length;j++){
                if(arr[i] == test[j]){
                    if (j == arr.length-1) {
                        answer.add("Gold Medal");
                    } else if(j == arr.length-2){
                        answer.add("Silver Medal");
                    } else if(j == arr.length-3){
                        answer.add("Bronze Medal");
                    } else{
                        answer.add(Integer.toString(arr.length-j));
                    }     
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        int[] scores = {5,4,3,2,1};
        App ap = new App();

        // System.out.println("answer: " + ap.solution(scores));
    }
}
