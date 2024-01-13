package homework2024;
/* [주석 1 : 과제 설명]

객체지향 프로그래밍 평가과제 (배점 25점)
학과 : 정보통신공학과
학번 : 201702251
이름 : 유승원

*/
public class Subject1 {

    // 정적 중첩 클래스
    static class Animal {
        void eat() {
            System.out.println("동물이 먹는다.");
        }

        void sleep() {
            System.out.println("동물이 잔다.");
        }
    }

    // 정적 중첩 클래스
    static class Dog extends Animal {                // 주석 2: 클래스 상속 
        void bark() {
            System.out.println("개가 짖는다.");
        }
    }

    public static void main(String[] args) {
        // 내부 클래스의 인스턴스 직접 생성
        Animal myAnimal = new Animal();// 객체 생성
        myAnimal.eat();
        myAnimal.sleep();

        Dog myDog = new Dog(); //객체생성
        myDog.eat();
        myDog.sleep();
        myDog.bark();
    }
}