package day16_switch_ternary;

public class CappuccinoByer {
    public static void main(String[] args) {
        String size = "Tall";
        double price ;
        int calories ;

        switch (size) {
            case "tall", "Tall":
                System.out.println("Tall Cappuccino please");
                price = 3.69;
                calories = 90;
                System.out.println("Price = " + price);
                System.out.println("Calories = " + calories);
                break;
            case "Grande", "grande":
                System.out.println("grande Cappuccino please ");
                price = 3.99;
                calories = 120;
                System.out.println("Price = " + price);
                System.out.println("Calories = " + calories);
                break;
            case "Venti", "venti":
                System.out.println("Veti Cappuccino please ");
                price = 4.29;
                calories = 150;
                System.out.println("Price = " + price);
                System.out.println("Calories = " + calories);
                break;
            default:
                System.out.println("We don't serve that size of Cappucino");


        }

    }
}
