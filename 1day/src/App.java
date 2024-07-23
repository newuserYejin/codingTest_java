import java.util.*;

class Solution {
    public int[] solution(long n) {
        String number = Long.toString(n);
        System.out.println("n = "+number);

        String[] str = number.split(""); 
        int[] answer = new int[str.length];

        for(int i=0;i<str.length;i++){
            answer[str.length-i-1] = Integer.parseInt(str[i]);
        }

        return answer;
    }
    
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        long inputNum = scan.nextLong();
        scan.close();
        
        Solution sol = new Solution();
        int[] result = sol.solution(inputNum);

        System.out.println("array = "+ Arrays.toString(result));
    }
}