import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n--- HOSPITAL MENU ---");
            System.out.println("1. Add Doctor");
            System.out.println("2. Add Patient");
            System.out.println("3. View All");
            System.out.println("4. Demonstrate Polymorphism");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter doctor name: ");
                String name = sc.next();
                people.add(new Doctor(1, name, "Therapist", 12));
            }

            else if (choice == 2) {
                System.out.print("Enter patient name: ");
                String name = sc.next();
                people.add(new Patient(2, name, 20, "Flu"));
            }

            else if (choice == 3) {
                for (Person p : people) {
                    System.out.println(p);
                }
            }

            else if (choice == 4) {
                for (Person p : people) {
                    p.work(); // POLYMORPHISM
                }
            }

        } while (choice != 0);

        sc.close();
    }
}
