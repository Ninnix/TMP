package Lezione06.primo;

/**
 * Created by nikyw on 12/03/2017.
 */
public class C1 {
    // una classe

    private int a = 1;
    protected int b = 2;

    public C1 (int a) {
        this.a = a;
    }

    public C1 (int a, int b) {
        this(a);
        this.b = b;
    }

    public void stampami () {
        System.out.println("a = " + a + "; b = " + b);
    }

    public void stampaqualcosa () {
        System.out.println("C1");
    }
}
