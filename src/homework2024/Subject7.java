package homework2024;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Subject7 {

    public static void main(String[] args) { // 주석 8 : 파일 입출력 사용
        // 파일에 문자열 쓰기
        writeToFile("example.txt", "Hello, Simple File IO!");

        // 파일에서 문자열 읽어오기
        String content = readFromFile("example.txt");
        System.out.println("파일에서 읽은 내용: " + content);
    }

    // 파일에 문자열 쓰기
    private static void writeToFile(String fileName, String content) {
        try {
            // 문자열을 파일에 쓰기
            Files.write(Paths.get(fileName), content.getBytes());
            System.out.println("파일에 문자열을 썼습니다.");
        } catch (IOException e) {
            System.err.println("파일에 쓰기 실패: " + e.getMessage());
        }
    }

    // 파일에서 문자열 읽어오기
    private static String readFromFile(String fileName) {
        StringBuilder content = new StringBuilder();

        try {
            // 파일에서 문자열 읽어오기
            List<String> lines = Files.readAllLines(Paths.get(fileName));

            // 읽어온 각 줄을 StringBuilder에 추가
            for (String line : lines) {
                content.append(line).append("\n");
            }

            System.out.println("파일에서 문자열을 읽었습니다.");
        } catch (IOException e) {
            System.err.println("파일 읽기 실패: " + e.getMessage());
        }

        return content.toString();
    }
}
