/*

Nillan Shah & Vini Rocha

        February 20, 2019
        Purpose: This program creates new RoachPopulation objects that have name & population instance variables
        Inputs: String for setName()
        Output: Instance variables, and printed confirmation messages
 */

public class Main {
    public static void main(String[] args) {
        //creating test colony 1
        RoachPopulation colony1 = new RoachPopulation();
        System.out.println("Colony 1");

        //Display name
        System.out.println("Name of colony 1: " + colony1.getName());

        System.out.println("Current number of roaches: " + colony1.getRoaches());
        //Breed colony1 two times
        colony1.breed();
        colony1.breed();

        // Print # of roaches in colony 1
        System.out.println("Current number of roaches after breed() two times: " + colony1.getRoaches());

        //Spray colony 1, reduces by 10 percent
        colony1.spray();

        // Print # of roaches in colony 1
        System.out.println("Current number of roaches after spray() one time: " + colony1.getRoaches());

        //Set colony 1 to new name
        colony1.setName("RoachGang1");

        //Display name change
        System.out.println("Name of colony 1 after name change: " + colony1.getName());

        System.out.println("\nColony 2");
        //Creating colony 2
        RoachPopulation colony2 = new RoachPopulation(100, "RoachGang2");

        //Get current name of colony 2
        System.out.println("Name of colony 2: " + colony2.getName());
        System.out.println("Current number of roaches: " + colony2.getRoaches());
        //Breed colony2 one time
        colony2.breed();

        // Print # of roaches in colony 2
        System.out.println("Current number of roaches after breed() 1 time: " + colony2.getRoaches());

        //Spray colony 2, reduces by 10 percent each time
        colony2.spray();
        colony2.spray();

        // Print # of roaches in colony 2
        System.out.println("Current number of roaches after spray() 2 times: " + colony2.getRoaches());

        //Set the name
        colony2.setName("RoachGang2_v2");

        //Display name
        System.out.println("Name of colony 2 after name change: " + colony2.getName());

        //Creating colony3
        RoachPopulation colony3 = new RoachPopulation(1000, "RoachGang3");
        System.out.println();
        System.out.println("Colony 3");
        System.out.println("Current name of colony 3: " + colony3.getName());
        System.out.println("Current number of roaches: " + colony3.getRoaches());

        //Spray colony 3, reduces by 10 percent each time
        colony3.spray();
        colony3.spray();
        colony3.spray();

        //Get current number of roaches in colony 3
        System.out.println("Current number of roaches after spray() 3 times: " + colony3.getRoaches());

        // Breed colony 3, doubles in size
        colony3.breed();

        //Get current number of roaches
        System.out.println("Current number of roaches after breed() one time: " + colony3.getRoaches());

        //Set name of colony3
        colony3.setName("RoachGang3_v2");
        //Display name
        System.out.println("Name of colony 3 after name change: " + colony3.getName());

        // Creating colony4
        System.out.println("\nColony 4");
         // Create colony for, set the name to RoachGang4 and population to 100
        RoachPopulation colony4 = new RoachPopulation(100,"RoachGang4");
        System.out.println("Name of the colony 4: " + colony4.getName());

        //Display current population
        System.out.println("Current population is: " + colony4.getRoaches());

        //Breed the roached 4 times
        colony4.breed();
        colony4.breed();
        colony4.breed();
        colony4.breed();
        System.out.println("The current population of roaches after breed 4 times is: " + colony4.getRoaches());

        // spray the roaches 6 times
        colony4.spray();
        colony4.spray();
        colony4.spray();
        colony4.spray();
        colony4.spray();
        colony4.spray();
        System.out.println("The current population of roaches after spray 6 times is: " + colony4.getRoaches());

        // Give the colony a new name
        colony4.setName("RoachGang4_v2");
        System.out.println("The new roach population name is: " + colony4.getName());

    }
}
