package OopConcepts;

public class Test {
    public static void main(String[] args){
        AmazonProduct laptop = new Electronics("Laptop", 4500.0);

        System.out.println("product: "+laptop.getName());
        System.out.println("price: "+laptop.getPrice());
        System.out.println("price: "+laptop.getCategory());
    }
}
