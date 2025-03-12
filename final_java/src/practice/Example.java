package practice;

public class Example {
    // 멤버 변수 선언
    private int number;
    private String text;

    // 초기화 블록
    {
        number = 42; // 초기값 설정
        text = "Hello, Java!"; // 초기값 설정
    }

    // 기본 생성자
    public Example() {
        System.out.println("생성자가 호출되었습니다.");
    }

    // 멤버 변수 출력 메소드
    public void display() {
        System.out.println("number: " + number);
        System.out.println("text: " + text);
    }

    // 메인 메소드
    public static void main(String[] args) {
        Example example = new Example(); // 객체 생성
        example.display(); // 멤버 변수 출력
    }
    
}