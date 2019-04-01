/*   Nillan Shah & Vini Rocha
     February 6, 2019
     Purpose: This program keeps track of endangered species and respective growth rates/populations
     Inputs: Sets (Growth rates, populations, and number of years (expected population)
     Output: Instance variables, and printed confirmation messages

Assignment
        Create a class to track endangered species.
        You will need to record the species name, current population, and growth rate.
        You will need methods to construct a new instance of an endangered specifies, calculate the projected population after x number of years, appropriate accessor and mutator methods.
        You will also need to override the toString() method.
        Your tester class will provide the data to construct several endangered species.
        Make sure you test each of the methods.(all constructors, accessors, mutators, and toString())
        Grading Criteria
        You will be graded on the following components:
        Does the program do what is required
        Is it properly documented
        Is it fully tested
        Is it properly designed


    Pseudocode--
        Methods:
        Gets
        - getSpeciesName(), returns String
        - getPopulation(), returns int
        - getGrowthRate(), returns double

        Sets
        - setPopulation(int population)
        - setGrowthRate(double rate)
        - setName(String speciesName)

        toString(), returns string
        projectedPopulation(int years)

    */

public class endangeredSpecies {
    // Declaring instance variables
    private String speciesName;
    private int population;
    private double growthRate;

    // creating parameter constructor
    public endangeredSpecies(String inputName, int inputPopulation, double inputGrowthRate){
        speciesName = inputName;
        population = inputPopulation;
        growthRate = inputGrowthRate;
    }

    // Gets
    public String getName(){
        return (speciesName);
    }

    public int getPopulation(){
        return population;
    }

    public double getGrowthRate(){
        return growthRate;
    }

    // Sets
    public void setSpeciesName(String inputName){
        speciesName = inputName;
        System.out.println("The species name has been changed to: " + speciesName);
    }

    public void setPopulation(int inputPopulation) {
        population = inputPopulation;
        System.out.println("The population has been changed to: " + population);
    }

    public void setGrowthRate(double inputRate) {
        growthRate = inputRate;
        System.out.println("The growth rate has been changed to: " + growthRate);
    }

    // Expected population growth

    public int expectedGrowth(int years) {
        return (int)(growthRate * years * population);
    }

    public String toString() {
        return ("The endangered species is " + speciesName +
                ". The population is: " + population +
                ". The growth rate is: " + growthRate);
    }
}