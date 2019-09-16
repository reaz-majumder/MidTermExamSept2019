package datastructure;
import java.util.*;


public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new
         * HashMap<String, List<String>>();
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         */

        List<String> cityofUsa = new LinkedList<>();

        cityofUsa.add("New York");
        cityofUsa.add("CA");
        cityofUsa.add("FL");
        cityofUsa.add("NJ");

        List<String> cityofCanada = new LinkedList<>();

        cityofCanada.add("Toronto");
        cityofCanada.add("Vancouver");
        cityofCanada.add("Calgary");
        cityofCanada.add("Alberta");

        Map<Integer,List<String>> map = new HashMap<>();

        map.put(1, cityofUsa);
        map.put(2, cityofCanada);

        for (Map.Entry<Integer,List<String>> city: map.entrySet()){
            System.out.println("->"+city.getValue());
        }

	/*Map<Integer,String> map = new LinkedHashMap<>();

	map.put(1, "New York");
	map.put(2, "NJ");
	map.put(3, "California");

	for (Map.Entry<Integer,String>  city: map.entrySet()){
	System.out.println(city.getKey()+"->"+city.getValue());
	}
        System.out.println(map.get(3));

	 */
    }
}




