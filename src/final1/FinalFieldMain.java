package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        // final 필드 - 생성자 초기화
        System.out.println("생성자 초기화 ");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println(constructInit1.value); // 객체마다 다르게 설정됨
        System.out.println(constructInit2.value);

        // final 필드 - 필드 초기화
        System.out.println("필드 초기화 ");
        Fieldinit fieldinit1 = new Fieldinit(); // value는 항상 10
        Fieldinit fieldinit2 = new Fieldinit();
        Fieldinit fieldinit3 = new Fieldinit();
        System.out.println(fieldinit1.value);
        System.out.println(fieldinit2.value);
        System.out.println(fieldinit3.value);

        // 상수
        System.out.println("상수");
        System.out.println(Fieldinit.CONST_VALUE);



    }
}
