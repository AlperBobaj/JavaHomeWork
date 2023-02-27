package HomeWork30;


import java.util.Map;
import java.util.TreeMap;

public class Person {

    private String name;
    private String lastName;
    private int age;
    private double salary;

    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public void print() {
        System.out.println(name + " " + lastName + "" + age + "" + salary);

    }


    public static void main(String[] args) {

        Map<Integer,Person> person=new TreeMap<>();
        person.put(45,new Person("Alper","Bobaj",33,1000));
        person.put(35,new Person("Florin","Vardari",44,1000));
        person.put(55,new Person("Rinor","Vardari",16,1000));

        for (int x: person.keySet()) {
            System.out.println("Person "+x);
            person.get(x).print();
            System.out.println();
        }



    }
}


















