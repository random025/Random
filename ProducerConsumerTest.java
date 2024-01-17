class Common
{
    static int value;
    boolean flag=true;
    public synchronized void producer(int i)
    {
        if(flag==true)
        {
            value = i;
            System.out.println("producer produced:"+value);
        }
        flag = false;
        notify();
        try{
            wait();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public synchronized int consumer()
    {
        if(flag==true){
            try{
                wait();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        flag = true;
        notify();
        return(value);
    }
}
class Producer extends Thread
{
    Common c;
    Producer(Common c){
        this.c = c;
    }
    public void run()
    {
        int i=0;
        while(true)
        {
            c.producer(i);
            i=i+1;
            try{
                Thread.sleep(1822);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
} 
class Consumer extends Thread
{
    Common c;
    Consumer(Common c){
        this.c=c;
    }
    public void run(){
        while(true){
            int i =c.consumer();
            System.out.println("consumer consumed:"+i);
            try{
                Thread.sleep(1822);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
class ProducerConsumerTest
{
    public static void main(String args[])
    {
        Common c1 = new  Common();
        Producer Pr = new Producer(c1);
        Consumer Cd = new Consumer(c1);
        Pr.start();
        Cd.start();
    }
}