import java.util.ArrayList;
public class LabArrayList {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();
        System.out.println(names);
import java.util.ArrayList;
        public class LabArrayList {
            public static void main(String[] args) {

                ArrayList<String> names = new ArrayList<String>();
                System.out.println(names);

                // Add names to the array list
                names.add("Alice");
                names.add("Bob");
                names.add("Connie");
                names.add("David");
                names.add("Edward");
                names.add("Fran");
                names.add("Gomez");
                names.add("Harry");
                System.out.println("Printing names array list: "+names);

                // Print fist and last name in sequence
                names.get(0);
                names.get(names.size()-1);
                System.out.println(" First name: "+names.get(0)+" | Last name: "+names.get(names.size()-1));

                // Print size
                System.out.println("Size of array: "+names.size());

                // Change Alice's Name
                names.set(0,"Alice B.Toklas");
                System.out.println("Printing names array list: "+names);

                // Place Doug after David
                names.add(4,"Doug");
                System.out.println("Printing names array list: "+names);

                // Enhanced loop for printing the array
                System.out.println("Print each name on the array");
                for (String loopName : names)
                {
                    System.out.println(loopName);
                }

                // Create new array list called names2 from names
                ArrayList<String> names2 = new ArrayList<String>(names);
                System.out.println("Print names2: "+names2);

                //Remove Alice from names
                names.remove(0);
                System.out.println("Removing Alice from Arrays");
                System.out.println("Array names: "+names);
                System.out.println("Array names2: "+names2);


            }
        }

        // Add names to the array list
        names.add("Alice");
        names.add("Bob");
        names.add("Connie");
        names.add("David");
        names.add("Edward");
        names.add("Fran");
        names.add("Gomez");
        names.add("Harry");
        System.out.println("Printing names array list: "+names);

        // Print fist and last name in sequence
        names.get(0);
        names.get(names.size()-1);
        System.out.println(" First name: "+names.get(0)+" | Last name: "+names.get(names.size()-1));

        // Print size
        System.out.println("Size of array: "+names.size());

        // Change Alice's Name
        names.set(0,"Alice B.Toklas");
        System.out.println("Printing names array list: "+names);

        // Place Doug after David
        names.add(4,"Doug");
        System.out.println("Printing names array list: "+names);

        // Enhanced loop for printing the array
        System.out.println("Print each name on the array");
        for (String loopName : names)
        {
            System.out.println(loopName);
        }

        // Create new array list called names2 from names
        ArrayList<String> names2 = new ArrayList<String>(names);
        System.out.println("Print names2: "+names2);

        //Remove Alice from names
        names.remove(0);
        System.out.println("Removing Alice from Arrays");
        System.out.println("Array names: "+names);
        System.out.println("Array names2: "+names2);


    }
}
