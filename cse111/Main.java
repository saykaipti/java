public class Main {

    static class A {
        public int m = 14, n = -1, p = 3;
        public static int temp = 11;

        public void methodA(int m, int n) {
            int x = 0;
            p = this.p + m + (temp++);
            x = x + 2 + n;
            this.n = n + B.x + p;

            System.out.println(this.m + " " + p + " " + this.n);
            System.out.println("x = " + x);
        }
    }

    static class B extends A {
        public static int x = 6;

        public void methodB(int x, int y) {
            y = ++y + this.p + n;
            super.p = x + 2 + temp;
            methodA(temp, x);
            B.x = this.x + x + temp;

            System.out.println(B.x + " " + y + " " + temp);

            int sum = x + y + B.x;
            System.out.println("sum = " + sum);
        }
    }

    public static void main(String[] args) {
        B b1 = new B();
        b1.methodB(3, 5);

        A a1 = new A();
        a1.methodA(12, -9);
    }
}