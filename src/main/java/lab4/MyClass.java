package lab4;

public class MyClass {

    public void publicWithout() {
        System.out.println("publicWithout");
    }

    @MyAnno(n = 1)
    public void publicWith() {
        System.out.println("publicWith");
    }

    private void privateWithout() {
        System.out.println("publicWithout");
    }

    @MyAnno(n = 2)
    private void privateWith() {
        System.out.println("privateWith");
    }

    protected void protectedWithout() {
        System.out.println("protectedWithout");
    }

    @MyAnno(n = 3)
    protected void protectedWith() {
        System.out.println("protectedWithout");
    }

}
