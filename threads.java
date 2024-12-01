class BMS extends Thread
{
    public void run()
    {
        for(int i=1; i<=3; i++) {
            System.out.println("BMS Collage of Engineering " + i);

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
class CSE extends Thread
{
    public void run()
    {
        for(int i=1; i<=10; i++) {
            System.out.println("CSE " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Print {
    public static void main(String args[])
    {
        BMS b = new BMS();
        b.start();

        CSE c = new CSE();
        c.start();
    }
}