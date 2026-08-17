package static1;

public class Data1 {
    public String name;
    public int count;

    public Data1(String name){ // 생성된 객체의 수 세기
        this.name = name;
        count++;
    }
}
