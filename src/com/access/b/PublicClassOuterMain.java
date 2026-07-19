package com.access.b;

//import com.access.a.DefaultClass1;
import com.access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        // 다른 패키지 접근 불가
//        DefaultClass1 class1 = new DefaultClass1();
    }
}
