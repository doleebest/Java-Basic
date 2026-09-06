package poly.ex3;

import poly.ex1.Cow;

public class AbstractMain {
    public static void main(String[] args) {
        // 추상 메서드는 생성 불가

        Dog dog = new Dog();
        Cat cat = new Cat();

        cat.sound();
        cat.move();

        soundAnimal(dog);
        soundAnimal(cat);

    }

    private static void soundAnimal(AbstractAnimal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
