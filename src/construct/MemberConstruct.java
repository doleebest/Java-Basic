package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 추가
    MemberConstruct(String name, int age){
        this.name = name;
        this.age = age;
        this.grade = 50;
    }

    MemberConstruct(String name, int age, int grade){ // 이 부분이 생성자!
        System.out.println("생성자 호출" + name+age+grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
