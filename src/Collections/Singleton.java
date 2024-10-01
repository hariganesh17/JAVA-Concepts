package Collections;

public class Singleton {
    private static volatile Singleton obj;

    private Singleton() {
    }

     public static Singleton getInstance() {
        if(obj == null){
            synchronized (Singleton.class){
                if(obj == null){
                    obj = new Singleton();
                }
            }
        }
        return obj;
    }

    public void show() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.show();
    }
}