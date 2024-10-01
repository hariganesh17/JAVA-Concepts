package OopConcepts;

public class Product {
    String name;
    int  price;
    int rating;

    Product(String name, int price,int rating){
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
    void showDetails(){
        System.out.println("Product Name: "+name+" ,Product price: "+price+" ,product rating: "+rating);
    }
    public static void main(String[] args){
        Product smartPhone = new Product("SmartPhone",25000,92);
        smartPhone.showDetails();
    }
}
