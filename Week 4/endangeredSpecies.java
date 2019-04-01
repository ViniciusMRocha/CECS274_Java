/*

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
    */

public class endangeredSpecies {
    public static void main(String[] args) {
    }
    // create input parameter constructor
            /*
    Methods:
    Gets
    - getSpeciesName(), returns String
    - getPopulation(), returns int
    - getGrowthRate(), returns double

    Sets
    - setPopulation(int population)
    - setGrowthRate(double rate)

    toString(), returns string
    projectedPopulation(int years)

     */

    private String speciesName;
    private int population;
    private double growthRate;

            // creating parameter constructor
    public endangeredSpecies(String inputName, int inputPopulation, double inputGrowthRate){
        speciesName = inputName;
        population = inputPopulation;
        growthRate = inputGrowthRate;
    }

}