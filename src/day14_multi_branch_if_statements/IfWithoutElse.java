package day14_multi_branch_if_statements;

public class IfWithoutElse {
    public static void main(String[] args) {

        int year = 2020;

        if (year == 2020) {
            System.out.println("Covid19 pandemic year");
            System.out.println("Wear mask, and keep 6 feet distance");
        }

        System.out.println("And keep coding java");
        String country = "USA";
        if (country.equals("USA")) {
            System.out.println("Washington DC is the capital");
            System.out.println("white house in on Pennsylvania ave");
        }

        System.out.println("Welcome to " + country);
    }
}
