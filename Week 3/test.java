/*
Nillan Shah & Vini Rocha

        February 6, 2019
        Purpose: This program keeps track of endangered species and respective growth rates/populations
        Inputs: Sets (Growth rates, populations, and number of years (expected population)
        Output: Instance variables, and printed confirmation messages
*/
public class test {
    public static void main(String args[]){
        endangeredSpecies turtle = new endangeredSpecies(
                "Turtle", 100, 2.0);

        System.out.println("Testing getName(), getPopulation(), getGrowthRate()");
        System.out.println(turtle.getName());
        System.out.println(turtle.getPopulation());
        System.out.println(turtle.getGrowthRate());
        System.out.println();

        System.out.println("Testing setSpeciesName(), setPopulation(), and setGrowthRate()");
        turtle.setSpeciesName("Shark");
        turtle.setPopulation(150);
        turtle.setGrowthRate(3.7);
        System.out.println();

        //testing expected growth
        System.out.println("Testing expected population growth");
        System.out.println("Expected population growth: " + turtle.expectedGrowth(10));
        System.out.println();
        System.out.println("Testing toString() method");
        System.out.println(turtle.toString());
    }
}