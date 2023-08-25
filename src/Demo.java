import java.util.Scanner;

public class Demo {
  public static void main(String[] args) {
    String name = "Pat";
    int age = 23;
    Scanner keyboard = new Scanner(System.in);
    System.out.print("How beautiful are you? ");
    int degreeOfBeautilness = keyboard.nextInt();
    // System.out.println("Hey " + name + " at " + age + " years old.");
    System.out.printf("Hey %s at %d years old", name, age);
    System.out.printf("%nYou are %d %% beautiful.", degreeOfBeautilness);


    // DATATYPER

    double bmi = 97;
    int height = 22;
    bmi = height;
    height = (char)bmi;



    // STRING OG CHAR

    String firstName = "Patrick";
    String lastName = "Agergaard";
    System.out.println("\n" + lastName.charAt(3));
    System.out.println(lastName.equals("von Agergaard"));
    System.out.println(lastName == "Agergaard"); // Nej, brug .equals()
    System.out.println(lastName.concat("Hansen"));
    String fullName = firstName.concat(lastName);
    System.out.println(fullName); // Uden mellemrum
    keyboard.nextLine(); // Scanner bug (jeg fanger ikke returværdien - helt bevidst)

  }
}
