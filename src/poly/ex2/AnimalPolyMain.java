package poly.ex2;

public class AnimalPolyMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        Duck duck = new Duck();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
        soundAnimal(duck);

    }

    private static void soundAnimal(Animal animal) // 부모 animal는 자식 동물들을 담을 수 있음
    {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
