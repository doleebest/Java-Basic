package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 15,90); // 객체 생성과 동시에 메모리에 만들어지자 마자 셋팅까지!
        MemberConstruct member2 = new MemberConstruct("user2", 18,75); // 객체 생성과 동시에 메모리에 만들어지자 마자 셋팅까지!

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member:members){
            System.out.println("이름" + member.name + "나이" + member.age + "점수" + member.grade);
        }
    }
}
