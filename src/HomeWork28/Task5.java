package HomeWork28;

import java.util.ArrayList;

public class Task5 {

    public static void main(String[] args) {

        ArrayList<Integer>numbers=new ArrayList<>();
        for (int i = 1; i <=500 ; i++) {
            numbers.add(i);
      if(i%2==0){
          if(i%5==0){
              continue;
          }
          System.out.print(i);
      }



        }

        }

    }

