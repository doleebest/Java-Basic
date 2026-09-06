package poly.ex4;

public class Dog extends AbstractAnimal {
    @Override // 반드시 구현해야함. abstract
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("개 이동");
    }
}
