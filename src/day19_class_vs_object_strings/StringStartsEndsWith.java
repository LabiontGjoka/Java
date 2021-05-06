package day19_class_vs_object_strings;

public class StringStartsEndsWith {
    public static void main(String[] args){
        String word = "intellij idea";
        System.out.println(word.startsWith("i"));
        System.out.println(word.startsWith("in"));
        System.out.println(word.startsWith("intellij idea"));
        System.out.println("java".startsWith("j"));

        System.out.println(word.startsWith("Int"));

        System.out.println(word.endsWith("idea"));
        System.out.println(word.endsWith("a"));

        String name = "Irina";
        if (name.endsWith("a")){
            System.out.println("Maybe it is a female name");
        }
        System.out.println();
        System.out.println();

        String firstName = "Dr. Nadir";
        if (firstName.startsWith("Mr.")){
            System.out.println("Man");
        }else if (firstName.startsWith("Dr.")){
            System.out.println("Doctor");
        }else if (firstName.startsWith("Mrs.")){
            System.out.println("Married woman");
        }else if (firstName.startsWith("Ms.")){
            System.out.println("Single woman");
        }else if (firstName.startsWith("Sr.")){
            System.out.println("Senior");
        }else {
            System.out.println("Normal name");
        }

        String domain = "https://e-hentai.org/";
        if (domain.endsWith(".com")){
            System.out.println(domain+" Commercial website");
        }else if (domain.endsWith(".ru")){
            System.out.println(domain + " Russian website");
        }else if (domain.endsWith(".gov")){
            System.out.println(domain+ " Government website");
        }else if (domain.endsWith(".edu")){
            System.out.println(domain+ " Education website");
        }else if (domain.endsWith(".org/")){
            System.out.println(domain +" Organization website");
            System.out.println("I see you are a man of culture");;
        }



    }
}
