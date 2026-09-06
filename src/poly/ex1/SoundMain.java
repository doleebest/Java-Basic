package poly.ex1;

public class SoundMain {
    public static void main(String[] args) {
        Cow cow = new Cow();
        Cow cow1 = new Cow();
        Cow cow2 = new Cow();
        Cat cat = new Cat();
        Dog dog = new Dog();

        Cow[] cowarr = {cow1, cow2, cow};

        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        cow.sound();
        soundCow(cow);

        System.out.println("동물 소리 테스트 종료");
        cat.sound();
        System.out.println("동물 소리 테스트 시작");
    }

    private static void soundCat(Cat cat){
        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void soundCow(Cow cow){
        System.out.println("동물 소리 테스트 시작");
        cow.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
