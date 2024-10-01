package OopConcepts;

public class Electronics implements AmazonProduct {

    private String name;
    private double price;
    private String category;

    public Electronics(String name, Double price){
        this.name = name;
        this.price = price;
        this.category = "Electronics";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public String getCategory() {
        return category;
    }
}
