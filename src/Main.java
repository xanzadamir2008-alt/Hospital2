public class Main {
    public static void main(String[] args) {

        Patient p1 = new Patient(1, "Aruzhan", 20, "Flu");
        Doctor d1 = new Doctor(1, "Dr. Smith", "Therapist", 12);

        Appointment a1 = new Appointment(101, p1.getName(), d1.getName(), "2025-03-20");

        System.out.println(p1);
        System.out.println(d1);
        System.out.println(a1);

        p1.updateDiagnosis("Recovered");
        d1.addExperience(1);
        a1.reschedule("2025-03-25");

        System.out.println("\nAfter updates:");
        System.out.println(p1);
        System.out.println(d1);
        System.out.println(a1);
    }
}
