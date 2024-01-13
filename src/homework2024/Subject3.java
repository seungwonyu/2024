package homework2024;

import java.util.Scanner;

public class Subject3 {
	public static void main(String[] args) {
        // 1. 사용자로부터 숫자를 입력받기 위한 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        try { // 주석 4 : 예외 처리
            // 2. 숫자 입력 요청
            System.out.print("숫자를 입력하세요: ");

            // 3. 사용자로부터 입력된 문자열을 숫자로 변환
            int number = Integer.parseInt(scanner.nextLine());

            // 4. 입력된 숫자 출력
            System.out.println("입력한 숫자: " + number);

            // 5. 10을 입력한 숫자로 나눈 결과 출력
            int result = 10 / number;
            System.out.println("10을 입력한 숫자로 나눈 결과: " + result);
        } catch (NumberFormatException e) {
            // 6. 숫자로 변환할 수 없는 문자열을 입력한 경우 발생하는 예외 처리
            System.err.println("숫자를 입력해야 합니다.");
        } catch (ArithmeticException e) {
            // 7. 0으로 나누려고 할 때 발생하는 예외 처리
            System.err.println("0으로 나눌 수 없습니다.");
        } finally {
            // 8. 예외 발생 여부와 상관없이 항상 실행되는 블록
            System.out.println("프로그램 종료");
            
            // 9. Scanner 자원 해제
            scanner.close();
        }
    }
}
