import java.util.Scanner;

public class HelloWorld {
    public static void main(String [] args)  {//this is a comment
/* this is a
block of
comments
*/
        System.out.println("What is your name?");
        Scanner input = new Scanner(System.in);
        String name=input.nextLine();
        if (name.equalsIgnoreCase("Mimi"))
            System.out.println("Please bring cookies");
        int i=0;
        while (i<5)
        {
            System.out.println("Hello World" + " " + i);
            if (i==3)
                System.out.println("The number 3\n");
            else
                System.out.println("the number is not 3 " + name);
            i=i+1;
        }
    }


}