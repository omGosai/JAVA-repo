package DS.THRADE;


// Thrade class Implements Runnable

class test2 extends Thread implements Runnable{
    @Override
    public void run() {
        int i =0;
        while (i<10){
            System.out.println("Testing Thrade -->");
            i++;
            //sleep
            try{ Thread.sleep(1000);}
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}

public class Methods implements Runnable {
    @Override
    public void run() {
        int i=0;
        while(i<10){
            System.out.println("Thrade -->");
            i++;
            //sleep
            try{Thread.sleep(1000);}
            catch (Exception e){
                System.out.println(e); }
        }
    }

    public static void main(String[] args) {

        test2 t1 = new test2();
         Methods t2= new Methods();



        //calling 1st Thrade
        t1.run();

        //calling 2nd Thrade
        t2.run();


        //name
        System.out.println("Thrade name :"+t1.getName());
        t1.setName("Elon Musk");
        System.out.println("After Thrade Name :"+t1.getName());

        //ID
        System.out.println("Thrade ID :"+t1.getId());

        /*Priority
           1. Min Priority = 1
           2. Normal Priority = 5
           3. Max Priority = 10 */
        t1.setPriority(5);
        System.out.println("Priority of thrade :"+t1.getPriority());

        //Join
        //Is alive




    }
}
