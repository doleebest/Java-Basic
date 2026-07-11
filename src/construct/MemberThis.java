package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter){
        nameField = nameParameter; // 매개변수에 없으면 위의 지역변수를 가져다 씀. 이런 경우 this.nameField 생략
    }
}
