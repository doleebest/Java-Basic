package poly.ex3;

public abstract class AbstractAnimal {
    // 오버라이딩용
    public abstract void sound();

    // 상속 목적
    public void move(){
        System.out.println("움직여");
    }
}
