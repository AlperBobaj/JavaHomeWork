package HomeWork28;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        //2)Create an arraylist of cars and retrieve all the values using 3 different ways.


        ArrayList<String>cars=new ArrayList<>();
        cars.add("Jeep");
        cars.add("BMW");
        cars.add("Ford");
        System.out.println(cars);

        for (int i = 0; i < cars.size() ; i++) {
            System.out.println(cars.get(i));


        }
        for (String x:cars) {
            System.out.println(x);

        }
    }
}
