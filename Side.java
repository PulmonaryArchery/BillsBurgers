public class Side {

    private String type;
    private double price;

    public Side(String type) {
        this.type = type.toLowerCase();
        if (type.equals("fries") || type.equals("onion rings")) {
            price = 1.50;
        } else if (type.equals("sweet potato fries") || type.equals("mozzarella sticks")) {
            price = 2.00;
        } else System.out.println("Please select from fries, onion rings, sweet potato fries or mozzarella sticks.");
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

}
