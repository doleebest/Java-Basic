package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        // final 지역 변수
        final int data1;
        data1 = 10; // 최초 한번만 할당 가능
        // data1 = 20; // 이후 변경 불가

        final int data2 = 10;

    }

    static void method(final int parameter){
//        parameter = 30;
    }

}
