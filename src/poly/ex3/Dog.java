package poly.ex3;

public class Dog extends AbstractAnimal{
    @Override // 반드시 구현해야함. abstract
    public void sound() {
        System.out.println("멍멍");
    }
}
