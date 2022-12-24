package DS.THRADE;

public class Synchronization {
    public static void main(String[] args) {


        Thread t1 = new Thread(){
            public void run () {
                int i=0;
                while(i<=10){
                    System.out.println("=================");
                i++;
                try{Thread.sleep(1000);}catch (Exception e){}
                }
            }
        };

        Thread t2 = new Thread(){
            public void run () {
                int i=0;
                while(i<=10){
                    System.out.println("@@@@@@@@@@@@@@@@@@@@");
                i++;
                try{Thread.sleep(1000);}catch (Exception e){}
                }
            }
        };


        t1.start();
        t2.start();
    }
}
