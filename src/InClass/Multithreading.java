package InClass;

class Multithreading extends Thread{
    public void run () {
        for (int i = 1; i<=5; i++) {
            System.out.println("i is: " + i);
            if (i == 1) {
                Thread.yield();
            }
        }
    }
}
class B extends  Thread {
    public void run () {
        for (int j = 1; j<=5; j++) {
            System.out.println("j is: " + j);
            if (j == 3) {
//                stop();
                break;
            }
        }
    }
}
class C extends  Thread {
    public void run () {
        for (int k = 1; k<=5; k++) {
            System.out.println("k is: " + k);
            if (k == 2) {
                try {
                    sleep(2000);
                }
                catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}

class ThreadTest {
    public static void main(String[] args) {
        Multithreading m = new Multithreading();
        B b = new B();
        C c = new C();

        m.start();
        b.start();
        c.start();
    }
}

