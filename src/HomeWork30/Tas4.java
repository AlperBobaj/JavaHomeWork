package HomeWork30;

import java.util.LinkedHashSet;
import java.util.Set;

public class Tas4 {
    //4)Create the collection that will store single uniques Objects of a String type in which order is preserved.
    //Write a logic to concatenate all string from the collection.

    public static void main(String[] args) {

        Set<String > names=new LinkedHashSet<>();
        names.add("Florin");
        names.add("Alper");
        names.add("Ahmed");
        for (String x:names) {
            System.out.println(x);

        }
    }
}
