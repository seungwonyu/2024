package homework2024;
public class Subject5 {

    // 음료수 종류를 나타내는 열거타입 정의
    public enum Drink { // 주석 6 열거타입 객체화
        COKE("콜라", 1000),
        SPRITE("스프라이트", 1200),
        FANTA("환타", 1500);

        private final String name; // 음료수 이름
        private final int price;    // 음료수 가격

        // 열거타입 생성자
        Drink(String name, int price) {
            this.name = name;
            this.price = price;
        }

        // 음료수의 이름을 반환하는 메서드
        public String getName() {
            return name;
        }

        // 음료수의 가격을 반환하는 메서드
        public int getPrice() {
            return price;
        }
    }

    // 주문한 음료수 정보 출력
    public void orderDrink(Drink drink) {
        System.out.println(drink.getName() + "을(를) 주문하셨습니다. 가격은 " + drink.getPrice() + "원입니다.");
    }

    public static void main(String[] args) {
        Subject5 example = new Subject5();

        // 각 음료수 주문
        example.orderDrink(Drink.COKE);
        example.orderDrink(Drink.SPRITE);
        example.orderDrink(Drink.FANTA);
    }
}

