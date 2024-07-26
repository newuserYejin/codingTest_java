import java.util.*;

public class App {
        public String solution(String[] participant, String[] completion) {
            // 정렬을 이용한 풀이

            // String answer = "";

            // Arrays.sort(participant);
            // Arrays.sort(completion);
            
            // System.out.println(Arrays.toString(participant));
            // System.out.println(Arrays.toString(completion));

            // for (int i=0;i<completion.length;i++) {
            //     if(!participant[i].equals(completion[i])){
            //         answer = participant[i];
            //         return answer;
            //     }
            // }

            // answer = participant[participant.length-1];
            // return answer;

            HashMap<String,Integer> ha = new HashMap<>(); 
            for (String str : participant){
                ha.put(str, ha.getOrDefault(str,0) + 1);
            }

            for (String complet: completion) {
                ha.put(complet, ha.get(complet)-1);
            }

            for(String name:participant){
                if(ha.get(name) != 0){
                    return name;
                }
            }

            return "";
        }

    public static void main(String[] args) throws Exception {
        App ap = new App();
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        String result = ap.solution(participant, completion);
        System.out.println(result);
    }
}
