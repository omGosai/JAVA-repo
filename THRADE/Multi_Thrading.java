package DS.THRADE;

class test extends Thread {
    public void run() {
        int i = 10;
        while (i >= 0) {
            System.out.println("Thrade id :"+getId());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            i--;
        }
    }
}

public class Multi_Thrading extends Thread{
    public void run() {
        int i = 10;
        while (i >= 0) {
            System.out.println("Main Thrade ID -->"+getId());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            i--;
        }
    }

    public static void main(String[] args) {
        Multi_Thrading t1 = new Multi_Thrading();
        test t2 = new test();

        t1.start();
        t2.start();
    }
}
