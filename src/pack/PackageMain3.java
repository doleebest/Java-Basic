package pack;

import pack.A.User;

public class PackageMain3 {
    public static void main(String[] args) {

        User userA = new User();
        pack.B.User userB = new pack.B.User(); // 둘중 하나는 패키지 경로를 다 적어주어야 한다.
    }
}
