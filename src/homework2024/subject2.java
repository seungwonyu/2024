package homework2024;

// 인터페이스 정의
interface Car {
    void makeSound(); // 추상 메서드
}

// 인터페이스를 구현한 클래스
class Bmw implements Car { // 주석 3: 인터페이스 구현 클래스 선언
    @Override
    public void makeSound() {
        System.out.println("BMW가 시동걸립니다.");
    }
}

// 다른 클래스에서도 인터페이스 구현
class Benz implements Car {
    @Override
    public void makeSound() {
        System.out.println("Benz가 클락션을 울립니다.");
    }
}

 class InterfaceExample {
    public static void main(String[] args) {
        // 인터페이스를 구현한 클래스의 인스턴스 생성
        Bmw myBMW = new Bmw();
        Benz myBenz = new Benz();

        // 인터페이스 메서드 호출
        myBMW.makeSound(); // "BMW가 시동걸립니다." 출력
        myBenz.makeSound(); // "Benz가 클락션을 울립니다." 출력
    }
}
