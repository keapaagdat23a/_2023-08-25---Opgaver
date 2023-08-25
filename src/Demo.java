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
  }
}
