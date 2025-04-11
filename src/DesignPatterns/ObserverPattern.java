package DesignPatterns;

import java.util.ArrayList;
import java.util.List;

interface Observer{
    void update(String message);
}

interface Subject{
    void attach(Observer o);
    void detach(Observer o);
    void notifyObservers(String message);
}

//Concrete Subject
class StockMarket implements Subject{

    List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String msg) {
        for(Observer o : observers){
            o.update(msg);
        }
    }

    public void priceChanged(){
        notifyObservers("stock price updated");
    }
}

//Concrete observer
class Users implements Observer{
    String name;

    public Users(String name){
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " recevied " + message);
    }
}
public class ObserverPattern {
    public static void main(String[] args){

        StockMarket market = new StockMarket();

        Users one =new Users("Hari");
        Users two = new Users("Ganesh");

        market.attach(one);
        market.attach(two);

        market.priceChanged();
    }
}
