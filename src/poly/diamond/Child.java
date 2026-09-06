package poly.diamond;

public class Child implements InterfaceA, InterfaceB{
    @Override
    public void methodA() {
        System.out.println("method a");
    }

    @Override
    public void methodCommon() {
        System.out.println("common");
    }

    @Override
    public void methodB() {
        System.out.println("method b");
    }
}
