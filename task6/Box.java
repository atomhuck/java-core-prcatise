package task6;

public class Box<T> {
    private T a;

    T getA () { return a; }
    void setA(T a) { this.a = a; }
}

class Program {
    public static void main(String[] args) {
        var box1 = new Box<String>();
        box1.setA("Hello");
        System.out.println(box1.getA());

        var box2 = new Box<Integer>();
        box2.setA(10);
        System.out.println(box2.getA());
    }
}
