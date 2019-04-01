import java.util.*;

public class test {
    public static void main(String[] args) {
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(0, new City("Long Beach", "WY"));
        cities.add(1, new City("Long Beach", "CA"));
        cities.add(2, new City("Wyoming", "CA"));
        cities.add(3, new City("Artesia", "CA"));
        cities.add(4, new City("Alondra", "CA"));

        System.out.println("Unsorted: ");

        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i).name + ", " + cities.get(i).state);
        }

        Collections.sort(cities);

        System.out.println();
        System.out.println("Sorted: ");

        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i).name + ", " + cities.get(i).state);
        }
    }
}

