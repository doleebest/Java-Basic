package poly;

import poly.basic.Child;
import poly.basic.Parent;

public class PolyMain {
    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조
        System.out.println("parent -> parent 참조");
        Parent parent = new Parent();
        parent.parentMethod();

        // 자식 변수가 자식 인스턴스 참조
        System.out.println("child -> child 참조");
        Child child = new Child();
        child.childMethod();

        // 부모 변수가 자식 인스턴스 참조 (다형적 참조)
        System.out.println("parent -> child 참조");
        Parent poly = new Child();
        poly.parentMethod();
//        poly.childMethod();

    }
}
