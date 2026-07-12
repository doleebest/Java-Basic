package pack;
import pack.A.User;

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data(); // 같은 패키지 내에 있음
        User user = new User(); // 타 패키지. 따라서 경로를 다 적어주어야 함.
    }
}
