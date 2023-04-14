public class Burger {

    private String type;
    private double basePrice = 2.50;
    private String extraTopping;

    public Burger(String type) {
        this.type = type.toLowerCase();
        switch (type.toLowerCase()) {
            case "hamburger" -> basePrice = 2.50;
            case "cheeseburger" -> basePrice += 1;
            case "double cheeseburger" -> basePrice += 2.50;
            case "triple cheeseburger" -> basePrice += 3.50;
            default -> System.out.println("Please select from a hamburger, cheeseburger, double cheeseburger or triple cheeseburger.");
        }
    }

    public void addTopping(int numOfToppings) {
        switch (numOfToppings) {
            case 1 -> basePrice += 1;
            case 2 -> basePrice += 2;
            case 3 -> basePrice += 3;
            default ->
                    System.out.println("Minimum number of toppings is 1 and maximum number of toppings is 3, please enter a valid value.");
        }
    }

    public String getType() {
        return type;
    }

    public double getBasePrice() {
        return basePrice;
    }
}
