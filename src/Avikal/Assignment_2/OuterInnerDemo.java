package Avikal.Assignment_2;

public class OuterInnerDemo {

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.display();
        Outer.Inner inner = outer.new Inner();
        inner.display();
    }
}

class Outer {

    protected void display() {
        System.out.println("This is outer class display()");
    }

    class Inner {
        protected void display() {
            System.out.println("This is inner class display()");
        }

    }

}
