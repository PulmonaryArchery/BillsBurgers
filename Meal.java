import java.util.Scanner;

public class Meal {

    private String burger;
    private String drink;
    private String side;
    private double price = 4.99;

    public Meal() {
        this.burger = "hamburger";
        this.drink = "small coke";
        this.side = "small fries";
    }

    public Meal(String burger, String drink, String side) {
        this.burger = burger;
        this.drink = drink;
        this.side = side;
    }

    public void createMeal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Bill's Burgers. Please select your burger. We have hamburgers, cheeseburgers, double cheeseburgers or triple cheeseburgers.");
        String burger = scanner.nextLine();
        Burger burgerChoice = new Burger(burger);
        
        System.out.println("Thank you for selecting a " + burgerChoice.getType() + ". Would you like any additional toppings? We have cheese, bacon or fried onions.");
        String toppingChoice = scanner.nextLine();
        if (toppingChoice.equalsIgnoreCase("cheese") || toppingChoice.equalsIgnoreCase("bacon") || toppingChoice.equalsIgnoreCase("fried onions")) {
            System.out.println("You have selected " + toppingChoice + " on your burger.");
            burgerChoice.addTopping(1);
        } else if (toppingChoice.equalsIgnoreCase("cheese and bacon") || toppingChoice.equalsIgnoreCase("cheese and fried onions") || toppingChoice.equalsIgnoreCase("bacon and fried onions")) {
            System.out.println("You have selected " + toppingChoice + " on your burger.");
            burgerChoice.addTopping(2);
        } else if (toppingChoice.equalsIgnoreCase("cheese, bacon and fried onions")) {
            System.out.println("You have selected " + toppingChoice + " on your burger.");
            burgerChoice.addTopping(3);
        } else System.out.println("Please enter a valid selection.");
        
        System.out.println("What drink would you like with your meal? We have Coke, Diet Coke, Fanta or Sprite.");
        String drink = scanner.nextLine();
        System.out.println("What size would would you like your " + drink);
        String drinkSize = scanner.nextLine();
        Drink drinkChoice = new Drink(drink, drinkSize);
        
        System.out.println("What side would you like with your meal? We have fries, onion rings, sweet potato fries or mozzarella sticks.");
        String side = scanner.nextLine();
        Side sideChoice = new Side(side);
        
        double burgerPrice = burgerChoice.getBasePrice();
        double drinkPrice = drinkChoice.getPrice();
        double sidePrice = sideChoice.getPrice();
        double customMealPrice = burgerPrice + drinkPrice + sidePrice;
        System.out.println("Your order contains a " + burger + " with " + toppingChoice + ", a " + drinkSize + " " + drink + ", " + side + " and costs £" + customMealPrice);
    }

    @Override
    public String toString() {
        return "Your order contains a " + burger + ", " + drink + ", a " + side + " and costs £" + price;
    }
}
