package ref;


public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = "+ data);
        data = new Data();
        System.out.println("2. data = "+ data);
        data = null; // 더 이상 안 쓴다고 선언 (주소지 빼기)
        System.out.println("3. data = "+data);
    }
}
