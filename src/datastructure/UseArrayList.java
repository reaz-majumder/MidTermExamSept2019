package datastructure;

import java.util.ArrayList;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve
         * elements. Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("Audi");
        cars.add("Jeep");
        cars.add("Toyota");

        System.out.println(cars);

        //To access an element in the ArrayList, use the get() method
        // and refer to the index number. Here we get the value of car where index no
        //is 0 and than print out that value.

        System.out.println(cars.get(0));

        //Change an Item - To modify an element, use the set() method and
        // refer to the index number. Here we first modify the elements of car where
        // index no is [2] and than print out that value.

        cars.set(2, "FORD");
        System.out.println(cars);

        //To remove an element, use the remove() method and refer to the index number.

        cars.remove(3);
        System.out.println(cars);

        //To find out how many elements an ArrayList have, we use the size method,
        //here we print the size of the arraylist.

        System.out.println(cars.size());

        //To remove all the elements in the ArrayList, use the clear() method,
        //here we print the arraylist after clear method, and it shows the arraylist is blank.

        cars.clear();
        System.out.println(cars);

        //Loop Through an ArrayList
        //Loop through the elements of an ArrayList with a for loop, and use the size()
        // method to specify how many times the loop should run.

        cars.add("Volvo");
        cars.add("Jeep");
        cars.add("Nissan");
        for(int i=0;i<cars.size();++i){
            System.out.println(cars.get(i));
        }

        //We can also loop through an ArrayList with the for-each loop.
        cars.add("Mazda");
        for(String i: cars){
            System.out.println(i);
        }


        if (cars == null || cars.size()==0){
            System.out.println("No cars in the garage");
        }
        else{
            for(String i: cars){
                System.out.println("Cars in the Garage: " +i);
            }
        }
        System.out.println("#################");
    }

    }


