import java.util.ArrayList;
import java.util.Collections;

public class test {
    public static void main(String[] args) {
        // ArrayList 생성
        ArrayList<String> list = new ArrayList<>();

        // 요소 추가
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add(1, "Blueberry"); // 1번 인덱스에 "Blueberry" 추가

        // 요소 접근
        System.out.println("Element at index 2: " + list.get(2)); // 출력: Banana

        // 요소 교체
        list.set(2, "Cantaloupe");
        System.out.println("Updated list: " + list);

        // 요소 제거
        list.remove("Blueberry"); // 요소 "Blueberry" 제거
        list.remove(1); // 1번 인덱스의 요소 제거
        System.out.println("List after removals: " + list);

        // 리스트 크기 및 검사
        System.out.println("List size: " + list.size()); // 출력: 2
        System.out.println("Is the list empty? " + list.isEmpty()); // 출력: false

        // 정렬
        list.add("Banana");
        list.add("Apple");
        Collections.sort(list);
        System.out.println("Sorted list: " + list);

        // 서브리스트 생성
        ArrayList<String> subList = new ArrayList<>(list.subList(1, 3));
        System.out.println("Sublist: " + subList);
    }
}
