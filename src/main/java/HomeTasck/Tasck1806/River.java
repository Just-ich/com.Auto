package HomeTasck.Tasck1806;


public class River {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new MyThread());
        thread1.start();
    }
}
