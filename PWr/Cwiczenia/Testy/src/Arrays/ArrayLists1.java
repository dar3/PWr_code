package Arrays;

import java.util.ArrayList;

public class ArrayLists1 {

    ArrayLists1 arrayobiekt = new ArrayLists1();
    public static void main(String[] args) {



        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Skoda");
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");


//        prints all elements from the array
        System.out.println(cars);
//        prints first element of the ArrayList
        System.out.println(cars.get(0));
//        Changing element in the Array determined by the index
//        We choose index in the Array and give it the value which should be under that index
        cars.set(0, "Opel");
//        Shows the length of the Array
        System.out.println(cars.size());
        
        System.out.println("Pierwszy element listy: " + cars.get(0));
//        Gets last element
        System.out.println("Ostatni element listy: " + cars.get(cars.size()-1));
//        Gets one before last/ penultimate element
        System.out.println("Przed ostatni element listy: " + cars.get(cars.size()-2));

        System.out.println(cars.get(0));
        cars.remove(0);
        System.out.println(cars.size());
        System.out.println(cars);

//        Clears whole Array
        cars.clear();
        System.out.println(cars);
        System.out.println(cars.size());



    }

//    public void LoopingThroughArray(){
//        for (int i = 0; i < cars.size; i++) {
//
//        }
//    }


}
