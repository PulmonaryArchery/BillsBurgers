public class Drink {

    private String type;
    private String size;
    private double price;

    public Drink(String type, String size) {
        this.type = type;
        this.size = size;
        switch (size.toLowerCase()) {
            case "small" -> price = 1;
            case "medium" -> price = 1.25;
            case "large" -> price = 1.50;
            case "extra large" -> price = 2;
            default -> System.out.println("Please select from small, medium, large or extra large.");
        }
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }
}
