package extends1.access.Parent;

public class Parent {
    public int publicValue;
    protected int protectedValue;
    int defaultValue;

    private int privateValue;

    public void publicMethod(){
        System.out.println("Parent.publicMethod");
    }

    protected void protectedMethod(){
        System.out.println("Parent.protectedMethod");
    }

    void defaultMethod(){
        System.out.println("Parent.defaultMethod");
    }

    private void privateMethod(){
        System.out.println("Parent.privateMethod");
    }

    public void printParent(){
        System.out.println(publicValue);
        System.out.println(privateValue);
        System.out.println(protectedValue);
        System.out.println(defaultValue);

        defaultMethod();
        privateMethod();
    }
}
