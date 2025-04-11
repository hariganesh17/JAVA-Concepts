package DesignPatterns;


/*Singleton Pattern
Ensures a class has only one instance and provides a global point of access to it.
It's useful for managing shared resources like database connections.*/

class Logger{
    private static Logger object;

    private Logger(){

    }

    synchronized public static Logger getInstance(){
        if(object == null){
            object = new Logger();
        }
        return object;
    }

    public void log(String message){
        System.out.println("[Log]:"+message);
    }
}

public class SingletonPattern {
    public static void main(String[] args){
            Logger logger1 = Logger.getInstance();
            Logger logger2 = Logger.getInstance();

            logger1.log("user logged in");
            logger2.log("transaction started");

        System.out.println(logger1 == logger2);
    }
}
