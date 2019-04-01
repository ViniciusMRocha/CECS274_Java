import java.util.*;


public class City implements Comparable{
     String name;
     String state;

    public City(String inputName, String inputState){
        name = inputName;
        state = inputState;
    }

    public int compareTo(Object otherCity){

        City other = (City) otherCity;

        if (this.name.compareTo(other.name) == 0){
            return this.state.compareTo(other.state);
        } else {
            return this.name.compareTo(other.name);
        }
    }

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

        System.out.println("\nSorted: ");

        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i).name + ", " + cities.get(i).state);
        }
    }
}
