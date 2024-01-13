package homework2024;

import java.util.ArrayList;

public class Subject6 {

    public static void main(String[] args) { // 주석 7 : 컬렉션 프레임워크
        // 1. ArrayList 생성
        ArrayList<String> stringList = new ArrayList<>();

        // 2. ArrayList에 데이터 추가
        stringList.add("사과");
        stringList.add("바나나");
        stringList.add("딸기");

        // 3. ArrayList의 크기 출력
        System.out.println("ArrayList의 크기: " + stringList.size());

        // 4. ArrayList의 모든 요소 출력
        System.out.println("ArrayList의 모든 요소:");
        for (String fruit : stringList) {
            System.out.println(fruit);
        }

        // 5. 특정 인덱스의 요소 수정
        stringList.set(1, "수박");

        // 6. 수정된 ArrayList의 모든 요소 출력
        System.out.println("수정된 ArrayList의 모든 요소:");
        for (String fruit : stringList) {
            System.out.println(fruit);
        }

        // 7. 특정 요소의 인덱스 확인
        int indexOfWatermelon = stringList.indexOf("수박");
        System.out.println("수박의 인덱스: " + indexOfWatermelon);

        // 8. 특정 요소 제거
        stringList.remove("딸기");

        // 9. 제거된 ArrayList의 모든 요소 출력
        System.out.println("제거된 ArrayList의 모든 요소:");
        for (String fruit : stringList) {
            System.out.println(fruit);
        }
    }
}
