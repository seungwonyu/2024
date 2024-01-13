package homework2024;
interface Tire {
    void roll();
}

// HankookTire 클래스 - Tire 인터페이스를 구현
class HankookTire implements Tire {
    @Override
    public void roll() {
        System.out.println("한국 타이어가 굴러갑니다.");
    }
}

// KumhoTire 클래스 - Tire 인터페이스를 구현
class KumhoTire implements Tire {
    @Override
    public void roll() {
        System.out.println("금호 타이어가 굴러갑니다.");
    }
}

// Car 클래스
class Audi {
    Tire frontLeftTire = new HankookTire();
    Tire frontRightTire = new HankookTire();
    Tire backLeftTire = new HankookTire();
    Tire backRightTire = new HankookTire();
    
    void run() {
        frontLeftTire.roll();
        frontRightTire.roll();
        backLeftTire.roll();
        backRightTire.roll();
    }
}

// CombinedExample 클래스
public class Subject4 {
    public static void main(String[] args) {
        Audi myAudi = new Audi();
        
        myAudi.run();
        
        // 다형성을 통해 KumhoTire로 변경
        myAudi.frontLeftTire = new KumhoTire(); // 주석 5 :  다형성
        myAudi.frontRightTire = new KumhoTire();
        
        myAudi.run();
    }
}
