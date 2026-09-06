package poly;

import poly.basic.Child;
import poly.basic.Parent;

public class CastingMain1 {
    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조 (다형적 참조)
        Parent poly = new Child();
        // 단, 자식의 기능은 호출할 수 없다. 컴파일 오류 발생
//        poly.childMethod();

        // 다운 캐스팅 (부모타입->자식타입 타입 변경)
        Child child = (Child) poly; // 캐스팅 없이 그냥은 못담음
        child.childMethod();

        // 일시적 다운캐스팅 - 해당 메서드를 호출하는 순간만 다운캐스팅
        ((Child) poly).childMethod(); // 연산자 우선순위 때문에 메서드 앞에 괄호

    }
}
