package poly;

import poly.basic.Child;
import poly.basic.Parent;

public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent){
        parent.parentMethod();
        // child 인스턴스인 경우 childmethod() 실행
        if (parent instanceof Child child) {
            System.out.println("Child instance");
            child.childMethod();
        }else {
            System.out.println("child instance (x)");
        }
    }
}
