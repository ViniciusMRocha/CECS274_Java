/*
Nillan Shah & Vini Rocha

        February 20, 2019
        Purpose: This program creates new RoachPopulation objects that have name & population instance variables
        Inputs: String for setName()
        Output: Instance variables, and printed confirmation messages
*/

public class RoachPopulation {
    //instance variable to store population
    private String populationName;

    //instance variable to store roachPop name
    private int roachPopulation;

    //Creating constructor 1 - takes arguments for size of population and name
    public RoachPopulation(int inputPopulation, String inputName) {
        populationName = inputName;
        roachPopulation = inputPopulation;
    }
    //Creating constructor 2
    // The other takes no arguments and creates a RoachPopulation
    // with an initial population of 10 roaches.
    public RoachPopulation(){
        roachPopulation = 10;
    }

    //Breed() method - doubles population of roaches
    public void breed(){
        roachPopulation *= 2;
    }
    //Spray Method - reduces population by 10 percent
    public void spray(){
        roachPopulation = (int) (roachPopulation * .9);
    }
    //getRoaches - returns int, number of roaches
    public int getRoaches(){
        return roachPopulation;
    }
    // SetName - changes instance variable to inputName
    public void setName(String inputName) {
        populationName = inputName;
    }
    //Get name - returns string
    public String getName(){
        return populationName;
    }
}
