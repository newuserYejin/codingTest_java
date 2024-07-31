import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class App {
    public static class KthLargest {
        ArrayList<Integer> numList = new ArrayList<>();
        int k;

        public KthLargest(int k, int[] nums) {
            this.k = k;

            for(int i:nums){
                numList.add(i);
            }

            // numList.sort(Collections.reverseOrder());
        }
        
        public int add(int val) {
            numList.add(val);
            numList.sort(Collections.reverseOrder());

            return numList.get(k-1);
        }
    }

    public static void main(String[] args) throws Exception {
        KthLargest kthLargest = new KthLargest(3, new int[]{4, 5, 8, 2});

        // 주어진 테스트 케이스에 따라 결과 출력
        System.out.println(kthLargest.add(3)); // 출력: 4
        System.out.println(kthLargest.add(5)); // 출력: 5
        System.out.println(kthLargest.add(10)); // 출력: 5
        System.out.println(kthLargest.add(9)); // 출력: 8
        System.out.println(kthLargest.add(4)); // 출력: 8
    }
}

/*
2 4 5 8 -> 기본 주어진 배열

3 추가 3번째
2 3 4 5 8 -> 4 출력

5추가 3번째
2 3 4 5 5 8 -> 5출력

10추가 3번째
2 3 4 5 5 8 10 -> 5출력

9추가 3번째
2 3 4 5 5 8 9 10 -> 8출력

4추가 3번째
2 3 4 4 5 5 8 9 10 -> 8출력
 */