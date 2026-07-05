package oop1;

public class ValueObjectMain { // 클래스
    public static void main(String[] args) { // 메서드
        // 메서드 안 명령문
        ValueData valueData = new ValueData();
        valueData.add();
        valueData.add();
        valueData.add();
        System.out.println("숫자 증가 value = "+valueData.value);
    }
}
