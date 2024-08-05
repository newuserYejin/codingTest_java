import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public int[] solution(int[] answers) {
        int count1=0, count2=0, count3=0 ;
        
        List<Integer> person1 = new ArrayList<>();
        List<Integer> person2 = new ArrayList<>();
        List<Integer> person3 = new ArrayList<>();
        
        // 수포자 2의 배열 만들기 위해서 필요
        int[] person2_answer = {1, 3, 4, 5};
        int index = 0;

        // 수포자 3의 배열 만들기 위해서 필요
        int[] person3_answer = {3, 1, 2, 4, 5};
        
        for (int i=0;i<answers.length;i++){

            // 수포자 1의 정답
            person1.add((i % 5) + 1);

            // 수포자 2의 정답
            if (i%2 == 0) {
                // 홀수 위치엔 늘 2
                person2.add(2);
            } else {
                person2.add(person2_answer[index]);
                index++;
                if (index == person2_answer.length) {
                    index=0;
                }
            }

            // 수포자 3의 정답
            person3.add(person3_answer[i%person3_answer.length]);
            person3.add(person3_answer[i%person3_answer.length]);
        }

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        for (int a = 0;a<answers.length; a++){
            if (answers[a] == person1.get(a)) {
                count1++;
            }
            if (answers[a] == person2.get(a)) {
                count2++;
            }
            if (answers[a] == person3.get(a)) {
                count3++;
            }
        }

        List<Integer> answer = new ArrayList<>();

        int maxCount = Math.max(count1, Math.max(count2, count3));

        if (maxCount == count1) {
            answer.add(1);
        }
        if (maxCount == count2) {
            answer.add(2);
        }
        if (maxCount == count3) {
            answer.add(3);
        }


        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) throws Exception {
        int[] answers = {1,3,2,4,2};
        App ap = new App();

        System.out.println(Arrays.toString(ap.solution(answers)));
    }
}
