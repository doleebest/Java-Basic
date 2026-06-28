package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student();
        // 이제 student1 에 x001 이라는 참조값을 담아둠
        // student1 = x001 ; <- 이게 최종 결과임!!
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println(student1);
        System.out.println(student2);

        System.out.println("이름:"+student1.name+"나이:"+student1.age+"성적:"+student1.grade);
    }
}
