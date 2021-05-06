package day19_class_vs_object_strings;

public class StringCaseConversion {
    public static void main(String[] args){
        String word = "Word";
        System.out.println(word.toLowerCase());
        System.out.println("JAVA".toLowerCase());

        word.toLowerCase();
        System.out.println(word);

        String wordInLcase = word.toLowerCase();
        System.out.println("wordInLcase = " + wordInLcase);

        String company = "Amazon";
        System.out.println(company.toUpperCase());
        System.out.println("Company in uppercase - "+ company.toUpperCase());
        System.out.println("java".toUpperCase());
        
        // change company "Amazon" to "AMAZON"
        System.out.println("company = " + company);
        company =company.toUpperCase();
        System.out.println("company = " + company);

    }
}
