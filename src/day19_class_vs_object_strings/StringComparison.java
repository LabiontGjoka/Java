package day19_class_vs_object_strings;

public class StringComparison {
    public static void main(String[] args){
        String city = "Chicago";
//EQUALS() method - case SENSITIVE COMPARISON
        System.out.println(city.equals("Chicago"));
        System.out.println(city.equals("chicago"));
        System.out.println(city.equals("Chicago "));

        // EQUALSIGNORECASE() method - CASE INSENSITIVE COMPARISON
        System.out.println(city.equalsIgnoreCase("Chicago"));
        System.out.println(city.equalsIgnoreCase("CHICAGO"));
        System.out.println(city.equalsIgnoreCase("ChicaGo"));
        System.out.println(city.equalsIgnoreCase("Chiicago"));
        System.out.println(city.equalsIgnoreCase("Chi cago"));
        if (city.equals("CHICAGO")){
            System.out.println("equals() true");
        }else {
            System.out.println("equals() false");
        }

        if (city.equalsIgnoreCase("CHICAGO")){
            System.out.println("equalsIgnoreCase() true");
        }else {
            System.out.println("equalsIgnoreCase() false");
        }



    }
}
