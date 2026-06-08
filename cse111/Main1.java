class Foo {
    String name = "foo";

    public void call1() {
        System.out.println("Foo 1");
    }

    public void call2() {
        call1();
        System.out.println("Foo 2");
    }
}

class Bar extends Foo {
    @Override
    public void call2() {
        System.out.println("Bar 2");
    }

    public void call3() {
        System.out.println("Bar 3");
    }
}

class Buzz extends Bar {
    String name = "Buzz";

    @Override
    public void call1() {
        System.out.println("Buzz 1");
    }

    public void call4() {
        call3();
        System.out.println("Buzz 4");
    }
}

class Bux extends Foo {
    String name = "Bux";

    @Override
    public void call1() {
        System.out.println("Bux 1");
    }

    public void call3() {
        System.out.println("Bux 3");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Foo foo1 = new Foo();
        Bar bar1 = new Bar();
        Bux bux1 = new Bux();
        Foo foo2 = new Buzz();
        Bar bar2 = new Buzz();
        Object obj1 = new Foo();

        // Uncomment ONE at a time to trace outputs:

        // 1
         bar1.call1();

        // 2
        // foo2.call1();

        // 3
        // foo2.call2();

        // 4
        // bar2.call3();

        // 5
        // System.out.println(bar1.name);

        // 6
        // System.out.println(bar2.name);

        // 7
        // System.out.println(((Buzz)bar2).name);

        // 8
        // ((Buzz)bar1).call4();

        // 9
        // ((Bar)foo1).call3();

        // 10
        // ((Foo)bux1).call1();

        // 11
        // ((Bux)foo1).call1();

        // 12
        // bux1.call1();

        // 13
        // bux1.call2();

        // 14
        // ((Foo)foo2).call2();

        // 15
        // ((Buzz)obj1).call3();

        // 16
        // ((Buzz)obj1).call2();

        // 17
        // ((Bux)foo2).call2();

        // 18
        // ((Buzz)obj1).call1();

        // 19
        // System.out.println(foo2.name);

        // 20
        // System.out.println(((Bux)foo2).name);
    }
}
