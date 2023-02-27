package HomeWork30;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {

        // 1) Create a map of Best Buy store. Place
        // item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
        //Retrieve all keys and values from a Best Buy map using EntrySet.

        Map<Integer,String> store=new HashMap<>();
        store.put(536373,"Printer");
        store.put(646373,"Tv");
        store.put(756373,"Laptop");
        store.put(986373,"Monitor");

        var entry=store.entrySet();
        for (var x:entry) {
            System.out.println(x);

        }



    }

}