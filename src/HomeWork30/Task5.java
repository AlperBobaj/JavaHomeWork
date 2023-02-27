package HomeWork30;

import java.util.ArrayList;
import java.util.List;

public class Task5 {

    //5)Create a collection of integers in which you can keep duplicates.
    //Write a logic to find sum of all integers (edited)

    public static void main(String[] args) {


        List<Integer> integers=new ArrayList<>();
        integers.add(10);
        integers.add(20);
        integers.add(20);
        integers.add(30);
        integers.add(40);

        int sum=0;

        for (Integer x:integers) {

            sum+=x;



        }
        System.out.println(sum);
    }
}
