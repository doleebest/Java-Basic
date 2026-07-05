package oop1;

public class ValueDataMain { // 클래스
    public static void main(String[] args) { // 메서드
        // 메서드 안 명령문
        ValueData valueData = new ValueData();
        add(valueData);
        add(valueData);
        add(valueData);
        System.out.println("숫자 증가 value = "+valueData.value);
    }

    static void add(ValueData valueData){ // 데이터와 데이터를 증가시키는 함수가 분리!
        valueData.value++;
        System.out.println("숫자 증가 value = "+ valueData.value);
    }
}
