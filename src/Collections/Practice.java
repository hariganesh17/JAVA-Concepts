package Collections;

public class Practice extends Thread{
    @Override
    public void run(){
        System.out.println("Thread is running");
    }
    public static void main(String[] args){
        Practice thread = new Practice();
        thread.start();
    }
}
